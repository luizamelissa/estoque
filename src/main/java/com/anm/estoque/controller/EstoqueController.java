package com.anm.estoque.controller;
import com.anm.estoque.service.EstoqueServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anm.estoque.model.ProdutoModelo;


@RestController
public class EstoqueController {

    @Autowired
    private EstoqueServico es;

    @GetMapping("/")
    public void testeApi() {

        System.out.println("A API está funcionando!");

    }

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar() {
        return es.listar();
    }
    


}
