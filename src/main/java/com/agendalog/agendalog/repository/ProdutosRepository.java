package com.agendalog.agendalog.repository;

import com.agendalog.agendalog.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

// Aqui estou criando um instancia no banco atraves do jpa para manipular a tabela Produtos atraves dos
// atributos que eu tambem defini n classe produtos, onde eu passe como parametro para o jpaRepository

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
