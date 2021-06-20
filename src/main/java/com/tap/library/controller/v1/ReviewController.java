package com.tap.library.controller.v1;

import com.tap.library.model.dto.ReviewDto;
import com.tap.library.service.implementation.ReviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/review")
public class ReviewController {
    private final ReviewServiceImpl reviewServiceImpl;

    @Autowired
    public ReviewController(ReviewServiceImpl reviewServiceImpl){
        this.reviewServiceImpl = reviewServiceImpl;
    }

    @GetMapping
    public List<ReviewDto> getAll(){
        return reviewServiceImpl.getAll();
    }

    @PostMapping
    public void add(@RequestBody ReviewDto reviewDto){
        reviewServiceImpl.add(reviewDto);
    }
}
