package com.tap.library.service;

import com.tap.library.model.dto.RequestDto;

import java.util.List;

public interface RequestService {
    void add(RequestDto requestDto);

    List<RequestDto> getAll();
}
