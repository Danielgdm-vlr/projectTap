package com.tap.library.controller.v2;

import com.tap.library.model.dto.BookDto;
import com.tap.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2/bookFilter")
public class BookFilter {
    @Autowired
    private final BookService bookService;

    public BookFilter(BookService bookService){
        this.bookService = bookService;
    }

//    @GetMapping(path = "{name}")
//    public List<BookDto> getFilteredBooks(@PathVariable("name") String name){
//        return bookService.getFilteredBooks(name);
//    }

    @GetMapping
    @ResponseBody
    public List<BookDto> getFilteredBooksByName(@RequestParam String name){
        return bookService.getFilteredBooksByName(name);
    }
}
