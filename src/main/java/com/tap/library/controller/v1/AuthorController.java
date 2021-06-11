package com.tap.library.controller.v1;

import com.tap.library.model.dto.AuthorDto;
import com.tap.library.service.implementation.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/author")
public class AuthorController {
    private final AuthorServiceImpl authorServiceImpl;

    @Autowired
    public AuthorController(AuthorServiceImpl authorServiceImpl){
        this.authorServiceImpl = authorServiceImpl;
    }

    @PostMapping
    public void add(@RequestBody AuthorDto authorDto){
        authorServiceImpl.add(authorDto);
    }

    @GetMapping
    public List<AuthorDto> getAll(){
        return authorServiceImpl.getAll();
    }
}
