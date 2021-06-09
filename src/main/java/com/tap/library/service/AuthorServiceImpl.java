package com.tap.library.service;

import com.tap.library.model.dto.AuthorDto;
import com.tap.library.model.entities.AuthorEntity;
import com.tap.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService{
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }


    public void add(AuthorDto authorDto){
        authorRepository.save(convertDtoToEntity(authorDto));
    }

    public List<AuthorDto> getAll(){
        List<AuthorEntity> authorEntityList = authorRepository.findAll();
        List<AuthorDto> authorDtoList = new ArrayList<>();

        for (AuthorEntity authorEntity: authorEntityList){
            authorDtoList.add(convertEntityToDto(authorEntity));
        }

        return authorDtoList;
    }

    private AuthorDto convertEntityToDto(AuthorEntity authorEntity){
        AuthorDto authorDto = new AuthorDto();

        authorDto.setFullName(authorEntity.getFullName());
        authorDto.setInfo(authorEntity.getInfo());

        return authorDto;
    }

    private AuthorEntity convertDtoToEntity(AuthorDto authorDto){
        AuthorEntity authorEntity = new AuthorEntity();

        authorEntity.setFullName(authorDto.getFullName());
        authorEntity.setInfo(authorDto.getInfo());

        return authorEntity;
    }
}
