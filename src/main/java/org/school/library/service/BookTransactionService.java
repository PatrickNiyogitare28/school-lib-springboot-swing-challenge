package org.school.library.service;

import org.school.library.domain.BookTransaction;
import org.school.library.repository.IBookTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookTransactionService {
    @Autowired
    private IBookTransactionRepository bookTransactionRepository;

    public ResponseEntity<?> save(BookTransaction dto){
        return ResponseEntity.status(HttpStatus.CREATED).body(bookTransactionRepository.save(dto));
    }

    public List<BookTransaction> getAll(){
        return bookTransactionRepository.findAll();
    }

}
