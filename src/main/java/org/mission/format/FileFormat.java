package org.mission.format;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

@Getter
public class FileFormat {
    @SerializedName("author")
    private String author;

    @SerializedName("id")
    private int id;

    @SerializedName("content")
    private String content;
}
