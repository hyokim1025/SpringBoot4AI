package me.shinsunyoung.springbootdeveloper.dto;

import jakarta.validation.constraints.NotNull;

import java.util.Map;

public record GeneratorThumbnailRequest(
        @NotNull String title,
        @NotNull String content
) {
    public Map<String, Object> toMap() {
        return Map.of(
                "title", title,
                "content", content
        );
    }
}
