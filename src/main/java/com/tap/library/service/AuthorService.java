package com.tap.library.service;

import com.tap.library.entities.AuthorEntity;
import com.tap.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public void add(AuthorEntity authorEntity){
        authorRepository.save(authorEntity);
    }

    public List<AuthorEntity> getAll(){
        return authorRepository.findAll();
    }
}
