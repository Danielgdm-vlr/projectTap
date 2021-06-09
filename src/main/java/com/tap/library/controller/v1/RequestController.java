package com.tap.library.controller.v1;

import com.tap.library.model.entities.RequestEntity;
import com.tap.library.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/request")
public class RequestController {
    private final RequestService requestService;

    @Autowired
    public RequestController(RequestService requestService){
        this.requestService = requestService;
    }

    @PostMapping
    public void add(@RequestBody RequestEntity requestEntity){
        requestService.add(requestEntity);
    }

    @GetMapping
    public List<RequestEntity> getAll(){
        return requestService.getAll();
    }
}
