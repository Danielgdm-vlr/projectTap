package com.tap.library.controller.v1;

import com.tap.library.model.dto.BookDto;
import com.tap.library.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/book")
public class BookController {
    private final BookServiceImpl bookServiceImpl;

    @Autowired
    public BookController(BookServiceImpl bookServiceImpl){
        this.bookServiceImpl = bookServiceImpl;
    }

    @PostMapping
    public void add(@RequestBody BookDto bookDto){
        bookServiceImpl.add(bookDto);
    }

    @GetMapping
    public List<BookDto> getAll(){
        return bookServiceImpl.getAll();
    }
}
