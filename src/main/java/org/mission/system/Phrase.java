package org.mission.system;

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
    QUOTE_SPLIT(" / "),
    QUOTE_REMOVE_SUCCESS("번 명언이 삭제되었습니다."),
    QUOTE_SEARCH_FAIL("번 명언은 존재하지 않습니다."),
    EXISTING_QUOTE("명언(기존) : "),
    EXISTING_AUTHOR("작가(기존) : "),
    BUILD(" 파일의 내용이 갱신되었습니다."),
    WRONG_COMMAND("잘못된 명령어 입니다.");

    private final String message;
}
