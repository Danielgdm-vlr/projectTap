package com.tap.library.service;

import com.tap.library.model.dto.BookDto;

import java.util.List;

public interface BookService {
    void add(BookDto bookDto);

    List<BookDto> getAll();

    List<BookDto> getByName(String name);

    List<BookDto> getByGenre(String genre);

    List<BookDto> getByNameAndGenre(String name, String genre);

    List<BookDto> getByAuthor(String name);
}
