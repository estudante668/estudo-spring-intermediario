package com.example.loja.dominio.controle;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.loja.dominio.modelos.Produto;
import com.example.loja.servico.ProdutoServico;

@RestController
@RequestMapping("/api/produtos")
public class Controle {

	private final ProdutoServico service;

	public Controle(ProdutoServico service) {
		this.service = service;
	}

	@GetMapping
    public List<Produto> buscarProdutos(){
    	return service.listaProdutos();
    }

    @PostMapping
    public Produto create( @RequestBody Produto dto) { return service.criarProduto(dto);}
}
