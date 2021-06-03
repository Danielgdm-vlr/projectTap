package com.tap.library.service;

import com.tap.library.entities.BookEntity;
import com.tap.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public void add(BookEntity book){
        bookRepository.save(book);
    }

    public List<BookEntity> getAll(){
        return bookRepository.findAll();
    }
}
