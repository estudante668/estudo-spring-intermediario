package com.example.loja.servico;

import java.util.List;

import com.example.loja.dominio.modelos.Produto;
import com.example.loja.dominio.repositorio.ProdutoRepositorio;


public class OrdemServico {
	private final ProdutoRepositorio repo;
	
    public OrdemServico(ProdutoRepositorio repo) {
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
