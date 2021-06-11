package com.tap.library.service.intrf;

import com.tap.library.model.dto.RequestDto;

import java.util.List;

public interface RequestService {
    void add(RequestDto requestDto);

    List<RequestDto> getAll();
}
