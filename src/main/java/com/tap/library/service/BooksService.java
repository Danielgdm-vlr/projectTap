package com.tap.library.service;

import com.tap.library.models.Books;
import com.tap.library.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService{
    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository){
        this.booksRepository = booksRepository;
    }

    public void add(Books books){
        booksRepository.save(books);
    }

    public List<Books> getAll(){
        return booksRepository.findAll();
    }
}
