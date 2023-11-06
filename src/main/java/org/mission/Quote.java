package org.mission;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor @Getter
public class Quote {
    private final String content;
    private final String author;
}
