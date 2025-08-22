package com.agendalog.agendalog.controller2;

import com.agendalog.agendalog.model2.Pedidos;
import com.agendalog.agendalog.repository2.PedidosRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // Anotação que indica que esta classe recebera requeste e respondera
@RequestMapping("/pedidos")
public class PedidosController {

    private final PedidosRepository pedidosRepository;

    public PedidosController(PedidosRepository pedidosRepository) {
        this.pedidosRepository = pedidosRepository;
    }


    @GetMapping // Anotação que indica que ouve a requisições de metodo get da rota raiz /pedidos
    public List<Pedidos> Listar() {
        return pedidosRepository.findAll();
    }



}
