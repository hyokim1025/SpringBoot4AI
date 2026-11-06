package me.shinsunyoung.springbootdeveloper.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Map;

public record WritingSuggestionRequest(
        @NotNull String title,
        @NotNull String content,
        @NotNull String question
) {
    public Map<String, Object> toMap(String format) {
        return Map.of(
                "title", title,
                "content", content,
                "question", question,
                "format", format
        );
    }
}