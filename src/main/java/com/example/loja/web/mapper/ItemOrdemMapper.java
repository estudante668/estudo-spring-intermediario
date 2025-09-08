package com.example.loja.web.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.example.loja.dominio.modelos.ItemOrdem;
import com.example.loja.dominio.modelos.Produto;
import com.example.loja.web.dto.ItemOrdemDTO;

@Mapper(componentModel = "spring")
public interface ItemOrdemMapper {
	   
	    @Mapping(source = "produto.id", target = "produtoId")
        ItemOrdemDTO toDTO(ItemOrdem entity);

	    @Mapping(source = "produtoId", target = "produto", qualifiedByName = "mapProduto")
	    ItemOrdem toEntity(ItemOrdemDTO dto);

	    @Named("mapProduto")
	    default Produto mapProduto(Long id) {
	        if (id == null) return null;
	        Produto produto = new Produto();
	        produto.setId(id);
	        return produto;
	    }

}

    
