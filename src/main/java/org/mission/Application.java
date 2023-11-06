package org.mission;

import java.util.Scanner;
import org.mission.system.Command;
import org.mission.system.Phrase;
import org.mission.util.QuotesUtil;

public class Application {

    private final Scanner scanner;

    public Application(Scanner scanner) {
        this.scanner = scanner;
    }

    private boolean flag = true;
    private Command command;
    private QuotesUtil quotesUtil;

    public void start() {
        System.out.println(Phrase.START.getMessage());
        quotesUtil = new QuotesUtil(scanner);
        quotesUtil.loadQuotes();

        while (flag) {
            System.out.print(Phrase.INPUT_COMMAND.getMessage());
            command = new Command(scanner.nextLine());

            switch (command.getAction()) {
                case "등록":
                    quotesUtil.addQuote();
                    break;
                case "종료":
                    System.out.println(Phrase.END.getMessage());
                    flag = false;
                    break;
                case "목록":
                    quotesUtil.printQuote();
                    break;
                case "삭제":
                    quotesUtil.removeQuote(command.getQueryMap());
                    break;
                case "수정":
                    quotesUtil.editQuote(command.getQueryMap());
                    break;
            }
        }
    }
}
