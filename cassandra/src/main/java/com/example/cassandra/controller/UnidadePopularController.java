package com.example.cassandra.controller;

import com.example.cassandra.model.UnidadePopular;
import com.example.cassandra.repository.UnidadePopularRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/unidades")
public class UnidadePopularController {

    @Autowired
    private UnidadePopularRepository unidadePopularRepository;

    @PostMapping
    public ResponseEntity<UnidadePopular> createUnidadePopular(@RequestBody UnidadePopular unidadePopular) {
        UnidadePopular savedUnidadePopular = unidadePopularRepository.save(unidadePopular);
        return new ResponseEntity<>(savedUnidadePopular, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UnidadePopular>> getAllUnidades() {
        List<UnidadePopular> unidades = unidadePopularRepository.findAll();
        return new ResponseEntity<>(unidades, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UnidadePopular> getUnidadePopularById(@PathVariable UUID id) {
        return unidadePopularRepository.findById(id)
                .map(unidade -> new ResponseEntity<>(unidade, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
