package com.oneDev.onlinelibrary.repository;

import com.oneDev.onlinelibrary.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Optional<Book> findByIdAndAvailable(Long id, boolean available);
}
