package com.example.loja.web.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class ProdutoDTO {
 
 Long id;
 String nome;
 BigDecimal preco;
 String descricao;
 
 public ProdutoDTO() {
	super();
	// TODO Auto-generated constructor stub
}
 
 public ProdutoDTO(Long id, String nome, BigDecimal preco, String descricao) {
	super();
	this.id = id;
	this.nome = nome;
	this.preco = preco;
	this.descricao = descricao;
}


 public Long getId() {
	return id;
 }
 public void setId(Long id) {
	this.id = id;
 }
 public String getNome() {
	return nome;
 }
 public void setNome(String nome) {
	this.nome = nome;
 }
 public BigDecimal getPreco() {
	return preco;
 }
 public void setPreco(BigDecimal preco) {
	this.preco = preco;
 }
 public String getDescricao() {
	return descricao;
 }
 public void setDescricao(String descricao) {
	this.descricao = descricao;
 }
 @Override
 public int hashCode() {
	return Objects.hash(descricao, id, nome, preco);
 }
 
 
 @Override
 public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ProdutoDTO other = (ProdutoDTO) obj;
	return Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
			&& Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
 }
 
}
