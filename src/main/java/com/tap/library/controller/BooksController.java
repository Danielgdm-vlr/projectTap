package com.tap.library.controller;

import com.tap.library.models.Books;
import com.tap.library.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BooksController {
    private final BooksService booksService;

    @Autowired
    public BooksController(BooksService booksService){
        this.booksService = booksService;
    }

    @PostMapping
    public void add(@RequestBody Books books){
        booksService.add(books);
    }

    @GetMapping
    public List<Books> getAll(){
        return booksService.getAll();
    }
}
