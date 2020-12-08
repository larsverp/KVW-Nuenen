package com.example.KVWNuenen.controller;

import com.example.KVWNuenen.model.Parents;
import com.example.KVWNuenen.service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/parent")
public class ParentController {
    private final ParentService parentService;

    @Autowired
    public ParentController(ParentService parentService) {
        this.parentService = parentService;
    }

    @PostMapping
    public void storeParent(@RequestBody Parents parents){
        parentService.storeParent(parents);
    }

    @GetMapping(path = "{id}")
    public Optional<Parents> getParent(@PathVariable("id") String id){
        return parentService.getParent(id);
    }

    @GetMapping
    public List<Parents> getAllParents(){
        return parentService.getParent();
    }
}

