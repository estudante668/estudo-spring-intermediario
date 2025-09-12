package com.example.loja.web.mapper;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.loja.dominio.modelos.ItemOrdem;
import com.example.loja.dominio.modelos.Produto;
import com.example.loja.web.dto.ItemOrdemDTO;
import com.example.loja.web.mapper.ItemOrdemMapper;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class ItemOrdemMapperTest {
   
	@Autowired
    private ItemOrdemMapper mapper;

    @Test
    void deveConverterItemParaDTO() {
        Produto produto = new Produto();
        produto.setId(5L);

        ItemOrdem item = new ItemOrdem();
        item.setProduto(produto);
        item.setQuantity(2);
        
        item.setUnitPrice(new BigDecimal("99.90"));

        ItemOrdemDTO dto = mapper.toDTO(item);

        assertAll(
        	    () -> assertEquals(5L, dto.getProdutoId()),
        	    () -> assertEquals(2, dto.getQuantity()),
        	    () -> assertEquals(2, dto.getQuantity()),
        	    () -> assertEquals(0, dto.getUnitPrice().compareTo(new BigDecimal("99.90")))
        	);
    }

	
}
