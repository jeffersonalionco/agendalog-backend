package com.agendalog.agendalog.repository;

import com.agendalog.agendalog.models.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

// Aqui estou criando um instancia no banco atraves do jpa para manipular a tabela Forncedor atraves dos
// atributos que eu tambem defini n classe forncedor, onde eu passe como parametro para o jpaRepository

public interface FornecedoresRepository extends JpaRepository<Fornecedor, Long> {
}
