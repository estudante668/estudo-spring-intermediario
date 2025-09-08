package com.example.loja.web.mapper;


import org.mapstruct.Mapper;

import com.example.loja.dominio.modelos.Produto;
import com.example.loja.web.dto.ProdutoDTO;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {
    ProdutoDTO toDTO(Produto produto);
    Produto toEntity(ProdutoDTO dto);
}
