package com.tap.library.service;

import com.tap.library.model.dto.AuthorDto;
import com.tap.library.model.entities.AuthorEntity;

import java.util.List;

public interface AuthorService {
    void add(AuthorDto authorDto);

    List<AuthorDto> getAll();
}
