package com.tap.library.controller.v1;

import com.tap.library.model.dto.RequestDto;
import com.tap.library.service.implementation.RequestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/request")
public class RequestController {
    private final RequestServiceImpl requestServiceImpl;

    @Autowired
    public RequestController(RequestServiceImpl requestServiceImpl){
        this.requestServiceImpl = requestServiceImpl;
    }

    @PostMapping
    public void add(@RequestBody RequestDto requestDto){
        requestServiceImpl.add(requestDto);
    }

    @GetMapping
    public List<RequestDto> getAll(){
        return requestServiceImpl.getAll();
    }
}
