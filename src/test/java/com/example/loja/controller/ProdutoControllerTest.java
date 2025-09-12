package com.example.loja.controller;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.example.loja.dominio.controle.Controle;
import com.example.loja.dominio.modelos.Produto;
import com.example.loja.servico.ProdutoServico;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(Controle.class)
public class ProdutoControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
    private ProdutoServico produtoServico;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	@Test
	void deveCriarProduto() throws Exception {
		Produto produto = new Produto();
		produto.setId(1L);
		produto.setNome("Camisa");
		produto.setDescricao("Camisa polo");
		produto.setPreco(BigDecimal.valueOf(345.87));
		
		Mockito.when(produtoServico.criarProduto(any(Produto.class))).thenReturn(produto);
		
		mockMvc.perform(post("/api/produtos")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(objectMapper.writeValueAsString(produto)))
				.andExpect(jsonPath("$.id").value(1L))
		        .andExpect(jsonPath("$.nome").value("Camisa"))
		        .andExpect(jsonPath("$.descricao").value("Camisa polo"))
		        .andExpect(jsonPath("$.preco").value(345.87));

		
		
	}
}
