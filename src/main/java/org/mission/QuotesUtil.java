package org.mission;

import java.util.Scanner;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class QuotesUtil {

    private final Scanner scanner;

    public void addQuotes() {
        System.out.print(Phrase.INPUT_QUOTE.getMessage());
        String content = scanner.nextLine();

        System.out.print(Phrase.INPUT_AUTHOR.getMessage());
        String author = scanner.nextLine();
    }
}
