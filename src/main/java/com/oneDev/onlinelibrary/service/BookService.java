package com.oneDev.onlinelibrary.service;

import com.oneDev.onlinelibrary.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto createBook(BookDto bookDto);

    List<BookDto> getAllBooks();

    BookDto getBookById(Long id);

    List<BookDto> getBookByUserLoans(Long userId);

    BookDto updateBook(BookDto bookDto, Long id);

    void deleteBookById(Long id);
}
