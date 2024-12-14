package com.oneDev.onlinelibrary.service;

import com.oneDev.onlinelibrary.dto.LoanDto;

import java.util.List;

public interface LoanService {
    LoanDto createLoan(Long userId, Long bookId);

    List<LoanDto> getAllLoan();

    LoanDto getLoanById(Long id);

    LoanDto updateLoan(Long id, LoanDto loanDto);

    void deleteLoanById(Long id);

    String returnBook(Long userId);

    boolean isBookOverDue(Long loanId);
}
