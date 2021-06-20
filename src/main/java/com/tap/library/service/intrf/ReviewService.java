package com.tap.library.service.intrf;

import com.tap.library.model.dto.ReviewDto;

import java.util.List;

public interface ReviewService {
    List<ReviewDto> getAll();

    void add(ReviewDto reviewDto);
}
