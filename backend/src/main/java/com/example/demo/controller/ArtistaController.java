package com.example.demo.controller;

import com.example.demo.model.Artista;
import com.example.demo.repository.ArtistaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/artistas")
public class ArtistaController {

    private final ArtistaRepository artistaRepository;

    public ArtistaController(ArtistaRepository artistaRepository) {
        this.artistaRepository = artistaRepository;
    }

    @GetMapping
    public List<Artista> listarTodos() {
        return artistaRepository.findAll();
    }

    @PostMapping
    public Artista criar(@RequestBody Artista artista) {
        return artistaRepository.save(artista);
    }
}
