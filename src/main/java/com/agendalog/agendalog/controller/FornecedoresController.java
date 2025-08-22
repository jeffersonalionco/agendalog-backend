package com.agendalog.agendalog.controller;

import com.agendalog.agendalog.models.Fornecedor;
import com.agendalog.agendalog.repository.FornecedoresRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fornecedores")
public class FornecedoresController {

    // EStou criando um atributo forncedor do tipo ForncedoresRepository
    private final FornecedoresRepository fornecedor;

   /*
   * EStou criando um contrutor da clase que recebe automaticamente os dados de FornecedoresRepository
   * e injeta no atributo forncedor, sendo assim possivel utilizar os metodos do jpa na clase
   * forncedor
   * */
    public FornecedoresController(FornecedoresRepository fornecedor) {
        this.fornecedor = fornecedor;
    }

    @GetMapping
    public List<Fornecedor> Listar(){
        return fornecedor.findAll();
    }
}
