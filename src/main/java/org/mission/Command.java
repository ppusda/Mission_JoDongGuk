package org.mission;

import lombok.Getter;

@Getter
public class Command {
    private final String command;

    public Command(String command) {
        this.command = command;
    }
}
