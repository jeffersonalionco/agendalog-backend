package com.agendalog.agendalog.controller;

import com.agendalog.agendalog.models.Produtos;
import com.agendalog.agendalog.repository.ProdutosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutosController {


    private final ProdutosRepository repository;

    public ProdutosController(ProdutosRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Produtos> Listar(){
        return repository.findAll();
    }

// Teste para uma rota Post na tabela Proutos

    @PostMapping
    public Produtos criar(@RequestBody Produtos produto){
        return repository.save(produto);
    }



}
