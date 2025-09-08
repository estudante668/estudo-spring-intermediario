package com.example.loja.dominio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loja.dominio.modelos.Ordem;



public interface OrdemRepositorio extends JpaRepository<Ordem, Long>  {

}
