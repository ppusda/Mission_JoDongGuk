package org.mission;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    @DisplayName("Lv1 - 앱이 시작되고 종료를 입력하면 앱이 종료된다.")
    public void start_end() {
        Scanner scanner = TestUtil.genScanner("""
                종료
                    """);

        new Application(scanner).start();

        scanner.close();
    }

    @Test
    @DisplayName("Lv2 - 앱이 시작되고 등록을 입력 시 명언과 작가를 입력할 수 있다.")
    public void start_quoteInput_end() {
        Scanner scanner = TestUtil.genScanner("""
                등록
                현재를 사랑하라.
                작자미상
                종료
                        """.stripIndent());
        new Application(scanner).start();

        scanner.close();
    }

    @Test
    @DisplayName("Lv3 - 앱이 시작되고 명언을 등록 시 명언 번호를 출력한다.")
    public void start_quoteInput_printId_end() {
        Scanner scanner = TestUtil.genScanner("""
                등록
                현재를 사랑하라.
                작자미상
                종료
                        """.stripIndent());
        new Application(scanner).start();

        scanner.close();
    }

    @Test
    @DisplayName("Lv4 - 앱이 시작되고 명언을 등록 시 명언 번호가 증가한다.")
    public void start_quoteInput_printId_up_end() {
        Scanner scanner = TestUtil.genScanner("""
                등록
                현재를 사랑하라.
                작자미상
                등록
                미래를 사랑하라.
                누군가
                종료
                        """.stripIndent());
        new Application(scanner).start();

        scanner.close();
    }

    @Test
    @DisplayName("Lv5 - 앱이 시작되고 명언을 등록 후 목록을 출력한다.")
    public void start_quoteInput_printQuotes_end() {
        Scanner scanner = TestUtil.genScanner("""
                등록
                현재를 사랑하라.
                작자미상
                등록
                미래를 사랑하라.
                누군가
                목록
                종료
                        """.stripIndent());
        new Application(scanner).start();

        scanner.close();
    }

}