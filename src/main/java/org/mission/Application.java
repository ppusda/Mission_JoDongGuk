package org.mission;

import java.util.Scanner;

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

        while (flag) {
            System.out.print(Phrase.INPUT_COMMAND.getMessage());
            command = new Command(scanner.nextLine());

            switch (command.getCommand()) {
                case "등록":
                    quotesUtil.addQuotes();
                    break;
                case "종료":
                    System.out.println(Phrase.END.getMessage());
                    flag = false;
                    break;
            }
        }
    }
}
