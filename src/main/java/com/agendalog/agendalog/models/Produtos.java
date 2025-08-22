package com.agendalog.agendalog.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter // Gerencia os getters e setter pelo lombok
@Setter // Gerencia os getters e setter pelo lombok
@Entity  // Anotação jakarta informando que esta clase é refente a um tabela no banco postgres
public class Produtos {

    @Id // Declara que o id é o primary key da tabela
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Integer estoque;
    private String categoria;
    private String codigoBarras;
    private String marca;
    private BigDecimal peso;
    private String unidadeMedida;
    private LocalDate dataValidade;
    private Integer idFornecedor;
    private LocalDateTime dataCadastro;



}
