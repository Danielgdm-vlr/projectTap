package com.tap.library.controller;

import com.tap.library.entities.BookEntity;
import com.tap.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping
    public void add(@RequestBody BookEntity book){
        bookService.add(book);
    }

    @GetMapping
    public List<BookEntity> getAll(){
        return bookService.getAll();
    }
}
