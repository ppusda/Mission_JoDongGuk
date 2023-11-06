package org.mission.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.mission.domain.Quote;

public class FileUtil {

    private final static String PATH = "src/main/java/org/mission/data.json";
    private Gson gson = new Gson();

    public List<Quote> fileLoad() {
        List<Quote> quotes = new ArrayList<>();
        try {
            quotes = gson.fromJson(new JsonReader(new FileReader(PATH)), new TypeToken<List<Quote>>(){}.getType());
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR]" + e.getMessage());
        }

        return quotes;
    }
}
