package com.tap.library.controller.v2;

import com.tap.library.model.dto.BookDto;
import com.tap.library.service.implementation.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public record BookFilterController(BookServiceImpl bookServiceImpl) {
    @Autowired
    public BookFilterController {
    }

    @RequestMapping(value = "api/v2/bookFilterName", method = RequestMethod.GET)
    @GetMapping
    @ResponseBody
    public List<BookDto> getByName(@RequestParam String name) {
        return bookServiceImpl.getByName(name);
    }

    @RequestMapping(value = "api/v2/bookFilterGenre", method = RequestMethod.GET)
    @GetMapping
    @ResponseBody
    public List<BookDto> getByGenre(@RequestParam String genre) {
        return bookServiceImpl.getByGenre(genre);
    }

    @RequestMapping(value = "api/v2/bookFilterNameAndGenre", method = RequestMethod.GET)
    @GetMapping
    @ResponseBody
    public List<BookDto> getByNameAndGenre(@RequestParam String name, String genre) {
        return bookServiceImpl.getByNameAndGenre(name, genre);
    }

    @RequestMapping(value = "api/v2/bookFilterAuthor", method = RequestMethod.GET)
    @GetMapping
    @ResponseBody
    public List<BookDto> getByAuthor(@RequestParam String name) {
        return bookServiceImpl.getByAuthor(name);
    }
}
