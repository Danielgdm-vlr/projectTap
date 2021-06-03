package com.tap.library.service;

import com.tap.library.entities.RequestEntity;
import com.tap.library.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService {
    private final RequestRepository requestRepository;

    @Autowired
    public RequestService(RequestRepository requestRepository){
        this.requestRepository = requestRepository;
    }

    public void add(RequestEntity requestEntity){
        requestRepository.save(requestEntity);
    }

    public List<RequestEntity> getAll(){
        return requestRepository.findAll();
    }
}
