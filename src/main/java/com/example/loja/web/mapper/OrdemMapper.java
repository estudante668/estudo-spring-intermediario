package com.example.loja.web.mapper;

import org.mapstruct.Mapper;

import com.example.loja.dominio.modelos.Ordem;
import com.example.loja.web.dto.OrdemDTO;

@Mapper(componentModel = "spring", uses = { ItemOrdemMapper.class })
public interface OrdemMapper {
    OrdemDTO toDTO(Ordem ordem);
    Ordem toEntity(OrdemDTO dto);
}