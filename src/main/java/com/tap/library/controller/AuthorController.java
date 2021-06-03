package com.tap.library.controller;

import com.tap.library.entities.AuthorEntity;
import com.tap.library.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/author")
public class AuthorController {
    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
    }

    @PostMapping
    public void add(@RequestBody AuthorEntity authorEntity){
        authorService.add(authorEntity);
    }

    @GetMapping
    public List<AuthorEntity> getAll(){
        return authorService.getAll();
    }
}
