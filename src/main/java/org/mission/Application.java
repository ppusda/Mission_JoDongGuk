package org.mission;

import java.util.Scanner;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Application {

    private static final String startPhrase = "명언 앱";
    private static final String endPhrase = "앱 종료";
    
    private final Scanner scanner;

    public void start() {
        System.out.println(startPhrase);
        if(scanner.next().equals("종료")) {
            System.out.println(endPhrase);
        }
    }
}
