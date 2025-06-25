package com.example.demo.controller;

import com.example.demo.model.Obra;
import com.example.demo.repository.ObraRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/obras")
public class ObraController {

    private final ObraRepository obraRepository;

    public ObraController(ObraRepository obraRepository) {
        this.obraRepository = obraRepository;
    }

    @GetMapping
    public List<Obra> listarTodos() {
        return obraRepository.findAll();
    }

    @PostMapping
    public Obra criar(@RequestBody Obra obra) {
        return obraRepository.save(obra);
    }
}
