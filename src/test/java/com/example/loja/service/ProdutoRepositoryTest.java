package com.example.loja.service;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.loja.dominio.modelos.Produto;
import com.example.loja.dominio.repositorio.ProdutoRepositorio;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
@AutoConfigureTestDatabase
public class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepositorio repoProduto;
    
    @Test
    public void salvarRecuperarDados() {
    	
    	Produto produto = new Produto();
    	produto.setNome("Caneta");
    	produto.setPreco(new BigDecimal("245.89"));
    	produto.setDescricao("Caneta Azul, Azul Caneta");
    	
    	Produto salvo = repoProduto.save(produto);
    	Produto encontrado = repoProduto.findById(salvo.getId()).orElse(null);
    	
        assertNotNull(encontrado);
        assertEquals("Caneta", encontrado.getNome());

    }


}
