package org.mission.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import lombok.Getter;
import org.mission.domain.Quote;
import org.mission.system.Phrase;

@Getter
public class QuotesUtil {

    private final Scanner scanner;
    private final List<Quote> quotes;

    public QuotesUtil(Scanner scanner) {
        this.scanner = scanner;
        this.quotes = new ArrayList<>();
    }

    public void addQuote() {
        System.out.print(Phrase.INPUT_QUOTE.getMessage());
        String content = scanner.nextLine();

        System.out.print(Phrase.INPUT_AUTHOR.getMessage());
        String author = scanner.nextLine();

        quotes.add(new Quote(getLastId() + 1, content, author));
        System.out.println(quotes.size() + Phrase.ADD_QUOTE.getMessage());
    }

    public void printQuote() {
        System.out.println(Phrase.QUOTE_LIST.getMessage());
        System.out.println(Phrase.QUOTE_LINE.getMessage());

        quotes.stream().forEach(quote ->
                System.out.println(
                        quote.getId() + Phrase.QUOTE_SPLIT.getMessage()
                                + quote.getAuthor() + Phrase.QUOTE_SPLIT.getMessage()
                                + quote.getContent()));

    }

    public Long getLastId() {
        if (!quotes.isEmpty()) {
            return quotes.get(quotes.size() - 1).getId();
        } else {
            return 0L;
        }
    }

    public boolean quoteCheck(Long id) {
        return quotes.stream().anyMatch(quotation -> quotation.getId() == id.intValue());
    }

    public Quote getQuote(Long id) {
        return quotes.stream().parallel().filter(p -> p.getId() == id.intValue()).findAny()
                .orElseThrow(IllegalAccessError::new);
    }

    public void removeQuote(Map<String, String> queryMap) {
        Long id = Long.parseLong(queryMap.get("id"));

        if (quoteCheck(id)) {
            quotes.remove(getQuote(id));
            System.out.println(id + Phrase.QUOTE_REMOVE_SUCCESS.getMessage());
        } else {
            System.out.println(id + Phrase.QUOTE_SEARCH_FAIL.getMessage());
        }
    }

    public void editQuote(Map<String, String> queryMap) {
        Long id = Long.parseLong(queryMap.get("id"));

        if (quoteCheck(id)) {
            Quote quote = getQuote(id);

            System.out.println(Phrase.EXISTING_QUOTE.getMessage() + quote.getContent());
            System.out.print(Phrase.INPUT_QUOTE.getMessage());
            String editContent = scanner.nextLine();

            System.out.println(Phrase.EXISTING_QUOTE.getMessage() + quote.getAuthor());
            System.out.print(Phrase.INPUT_QUOTE.getMessage());
            String editAuthor = scanner.nextLine();

            quote.setContent(editContent);
            quote.setAuthor(editAuthor);
        } else {
            System.out.println(id + Phrase.QUOTE_SEARCH_FAIL.getMessage());
        }
    }

}
