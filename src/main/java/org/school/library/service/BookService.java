package org.school.library.service;

import org.school.library.domain.Book;
import org.school.library.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private IBookRepository bookRepository;

    public ResponseEntity<?> save(Book dto){
       Optional<Book> existsByTitle = bookRepository.existsByTitle(dto.getTitle());
       if(existsByTitle.isPresent()) {
           return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Book with title ["+dto.getTitle()+"] already exists");
       }
       return ResponseEntity.status(HttpStatus.CREATED).body(bookRepository.save(dto));
    }

    public List<Book> getAll(){
        return bookRepository.findAll();
    }
}
