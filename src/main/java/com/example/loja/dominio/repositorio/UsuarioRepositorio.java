package com.example.loja.dominio.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.loja.dominio.modelos.Usuario;


public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
}
