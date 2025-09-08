package com.example.loja.web.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.example.loja.dominio.modelos.Usuario;
import com.example.loja.web.dto.UsuarioDTO;


@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    // Converte Usuario → UsuarioDTO
    @Mapping(source = "role", target = "role")
    UsuarioDTO toDTO(Usuario usuario);

    // Converte UsuarioDTO → Usuario
    @Mapping(source = "role", target = "role")
    Usuario toEntity(UsuarioDTO dto);
}