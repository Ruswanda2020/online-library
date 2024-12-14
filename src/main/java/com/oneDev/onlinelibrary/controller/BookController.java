package com.oneDev.onlinelibrary.controller;

import com.oneDev.onlinelibrary.dto.BookDto;
import com.oneDev.onlinelibrary.service.BookService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController (BookService bookService){
        this.bookService = bookService;
    }
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping()
    public ResponseEntity<BookDto> createBook(@Valid @RequestBody BookDto bookDto){
        return new ResponseEntity<>(bookService.createBook(bookDto), HttpStatus.CREATED);
    }

    @GetMapping()
    public List<BookDto> getAllBook(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBookById(@PathVariable(name = "id") Long id){
        return ResponseEntity.ok(bookService.getBookById(id));
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user/{userId}/loans")
    public ResponseEntity<List<BookDto>> getBookByUserLoans(@PathVariable Long userId){
        List<BookDto> books = bookService.getBookByUserLoans(userId);
        return ResponseEntity.ok(books);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/{id}")
    public ResponseEntity<BookDto> updateBook(@PathVariable Long id, @RequestBody BookDto bookDto){
        BookDto bookResponse = bookService.updateBook(bookDto, id);

        return new ResponseEntity<>(bookResponse, HttpStatus.OK);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable(name = "id") Long id){
        bookService.deleteBookById(id);
        return new ResponseEntity<>("Book deleted successfully!", HttpStatus.OK);
    }
}
