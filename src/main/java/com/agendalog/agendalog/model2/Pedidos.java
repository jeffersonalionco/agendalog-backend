package com.agendalog.agendalog.model2;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter // EStou gerando os getter com lombok
@Setter // Estou gerando os setter com lombok
@Entity // Informando que esta clase é uma tabelas do banco de dados
public class Pedidos {

    @Id     // Id que identifica a primary key da tabela, Pedidos...
    Long id;
    Long numero;
    String nome;


}
