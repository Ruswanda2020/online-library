package com.oneDev.onlinelibrary.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDto {
    private Long id;
    private String imageUrl;
    private String title;
    private String author;
    private boolean available;

    public BookDto(Long id, String imageUrl, String title, String author) {
        this.id = id;
        this.imageUrl = imageUrl;
        this.title = title;
        this.author = author;
    }
}
