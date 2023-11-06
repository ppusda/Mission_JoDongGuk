package org.mission;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class Quote {
    private final Long id;
    private String content;
    private String author;

}
