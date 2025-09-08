package com.example.loja.dominio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.loja.dominio.modelos.Produto;

@Repository
public interface ProdutoRepositorio extends JpaRepository<Produto, Long> {

}
