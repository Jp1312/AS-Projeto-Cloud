package com.example.demo.controller;

import com.example.demo.model.Exposicao;
import com.example.demo.repository.ExposicaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/exposicoes")
public class ExposicaoController {

    private final ExposicaoRepository exposicaoRepository;

    public ExposicaoController(ExposicaoRepository exposicaoRepository) {
        this.exposicaoRepository = exposicaoRepository;
    }

    @GetMapping
    public List<Exposicao> listarTodos() {
        return exposicaoRepository.findAll();
    }

    @PostMapping
    public Exposicao criar(@RequestBody Exposicao exposicao) {
        return exposicaoRepository.save(exposicao);
    }
}
