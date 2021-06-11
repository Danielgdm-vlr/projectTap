package com.tap.library.service.intrf;

import com.tap.library.model.dto.AuthorDto;

import java.util.List;

public interface AuthorService {
    void add(AuthorDto authorDto);

    List<AuthorDto> getAll();
}
