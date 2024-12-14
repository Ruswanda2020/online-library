package com.oneDev.onlinelibrary.repository;

import com.oneDev.onlinelibrary.entity.Loan;
import lombok.NonNull;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    Optional<Loan> findByUserIdAndReturnDateIsNull(Long userId);

    @NonNull
    @EntityGraph(attributePaths = {"user", "book"})
    List<Loan> findAll();

}
