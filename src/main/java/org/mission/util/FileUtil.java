package org.mission.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.mission.domain.Quote;
import org.mission.system.Phrase;

public class FileUtil {

    private final static String PATH = "src/main/java/org/mission/";
    private final static String FILENAME = "data.json";
    private Gson gson = new Gson();

    public void fileSave(List<Quote> quotes) {
        try {
            FileWriter file = new FileWriter(PATH + FILENAME);
            file.write(gson.toJson(quotes));
            file.flush();
            file.close();

            System.out.println(FILENAME + Phrase.BUILD.getMessage());
        } catch (IOException e) {
            System.out.println("[ERROR]" + e.getMessage());
        }
    }

    public List<Quote> fileLoad() {
        List<Quote> quotes = new ArrayList<>();
        try {
            quotes = gson.fromJson(new JsonReader(new FileReader(PATH + FILENAME)),
                    new TypeToken<List<Quote>>() {
                    }.getType());
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR]" + e.getMessage());
        }

        return quotes;
    }
}
