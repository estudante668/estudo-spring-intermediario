package com.example.loja.servico;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.loja.dominio.modelos.Produto;
import com.example.loja.dominio.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
	
	private final ProdutoRepositorio repo;
	
    public ProdutoServico(ProdutoRepositorio repo) {
    	this.repo = repo;
    }


    public List<Produto> listaProdutos() {
     return repo.findAll();
   }

   public Produto criarProduto( Produto p) {
   return repo.save(p);
   }

   public void deletarProduto(Long id) { 
	   repo.deleteById(id); 
}
   
}