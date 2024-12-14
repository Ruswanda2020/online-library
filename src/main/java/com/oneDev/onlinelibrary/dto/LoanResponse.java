package com.oneDev.onlinelibrary.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LoanResponse {
    private Long id;
    private Long userId;
    private Long bookId;
    private LocalDateTime borrowedAt;
    private LocalDateTime returnDate;
    private UserResponse user;
    private BookDto book;
}
