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

}