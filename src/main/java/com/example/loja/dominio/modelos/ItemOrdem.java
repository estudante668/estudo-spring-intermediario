package com.example.loja.dominio.modelos;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "itens-ordem")
public class ItemOrdem {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(optional = false)
	private Ordem ordem;
	
	@ManyToOne(optional = false)
	private Produto produto;
	
	private int quantity;
	
	private BigDecimal unitPrice;

	public ItemOrdem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ItemOrdem(Long id, Ordem ordem, Produto produto, int quantity, BigDecimal unitPrice) {
		super();
		this.id = id;
		this.ordem = ordem;
		this.produto = produto;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Ordem getOrder() {
		return ordem;
	}

	public void setOrder(Ordem order) {
		this.ordem = order;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, ordem, produto, quantity, unitPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemOrdem other = (ItemOrdem) obj;
		return Objects.equals(id, other.id) && Objects.equals(ordem, other.ordem)
				&& Objects.equals(produto, other.produto) && quantity == other.quantity
				&& Objects.equals(unitPrice, other.unitPrice);
	}
	
	
}
