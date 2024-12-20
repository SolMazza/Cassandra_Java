package com.example.cassandra.controller;


import com.example.cassandra.model.UnidadePopular;
import com.example.cassandra.repository.UnidadePopularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/unidadePopular")
public class UnidadePopularController {

    @Autowired
    private UnidadePopularRepository unidadePopularRepository;


    @PostMapping
    public UnidadePopular createUnidadePopular(@RequestBody UnidadePopular unidadePopular){
        return unidadePopularRepository.save(unidadePopular);
    }

    @GetMapping
    public List<UnidadePopular> getAllMovimentos(){
        return  unidadePopularRepository.findAll();
    }
    @GetMapping("/{id}")
    public UnidadePopular getUnidadePopularById(@PathVariable UUID id){
        return unidadePopularRepository.findById(id).orElse(null);
    }
}
