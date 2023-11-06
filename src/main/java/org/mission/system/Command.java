package org.mission.system;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public class Command {
    private final String command;
    private String action;
    private Map<String, String> queryMap;

    public Command(String command) {
        queryMap = new HashMap<>();
        this.command = command.trim();
        this.action = command;

        if(command.contains("?")) {
            String[] commandSplit = command.split("\\?");
            this.action = commandSplit[0].trim();
            String query = commandSplit[1];

            if(query.contains("&")) {
                setMultiQuery(query.split("&"));
            }

            setQueryMap(query);
        }
    }

    public void setMultiQuery(String[] querySplit) {
        for(String query: querySplit){
            setQueryMap(query);
        }
    }

    public void setQueryMap(String query) {
        String[] split = query.split("=");
        queryMap.put(split[0], split[1]);
    }
}
