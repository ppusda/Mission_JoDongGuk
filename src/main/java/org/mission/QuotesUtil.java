package org.mission;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lombok.Getter;

@Getter
public class QuotesUtil {

    private final Scanner scanner;
    private List<Quote> quotes;

    public QuotesUtil(Scanner scanner) {
        this.scanner = scanner;
        this.quotes = new ArrayList<>();
    }

    public void addQuotes() {
        System.out.print(Phrase.LINE_BREAK.getMessage() + Phrase.INPUT_QUOTE.getMessage());
        String content = scanner.nextLine();

        System.out.print(Phrase.LINE_BREAK.getMessage() + Phrase.INPUT_AUTHOR.getMessage());
        String author = scanner.nextLine();

        quotes.add(new Quote(content, author));
        System.out.println(
                Phrase.LINE_BREAK.getMessage() + quotes.size() + Phrase.ADD_QUOTE.getMessage());
    }

    public void printQuotes() {
        System.out.println(Phrase.QUOTE_LIST.getMessage());
        System.out.println(Phrase.QUOTE_LINE.getMessage());
        for(int idx = quotes.size()-1; idx >= 0; idx--) {
            System.out.println(idx+1 + Phrase.QUOTE_SPLIT.getMessage()
                    + quotes.get(idx).getAuthor() + Phrase.QUOTE_SPLIT.getMessage()
                    + quotes.get(idx).getContent());
        }
    }
}
