package org.mission;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter @RequiredArgsConstructor
public enum Phrase {
    START("== 명언 앱 =="),
    INPUT_COMMAND("명령) "),
    END("앱 종료"),
    INPUT_QUOTE("명언 : "),
    INPUT_AUTHOR("작가 : "),
    ADD_QUOTE("번 명언이 등록되었습니다."),
    LINE_BREAK("\n"),
    QUOTE_LIST("번호 / 작가 / 명언"),
    QUOTE_LINE("-------------------"),
    QUOTE_SPLIT(" / ");

    private final String message;
}
