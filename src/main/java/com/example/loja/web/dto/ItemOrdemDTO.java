package com.example.loja.web.dto;

import java.math.BigDecimal;
import java.util.Objects;

import com.example.loja.dominio.modelos.Produto;

	public class ItemOrdemDTO {
	    private Long produtoId;
	    private Produto produto;
	    private int quantity;
	    private BigDecimal unitPrice;

	    public ItemOrdemDTO() {}

	    public ItemOrdemDTO(Long produtoId, Produto produto, int quantity, BigDecimal unitPrice) {
	        this.produtoId = produtoId;
	        this.produto = produto;
	        this.quantity = quantity;
	        this.unitPrice = unitPrice;
	    }

	    public Long getProdutoId() { return produtoId; }
	    public void setProdutoId(Long produtoId) { this.produtoId = produtoId; }

	    public Produto getProduto() { return produto; }
	    public void setProduto(Produto produto) { this.produto = produto; }

	    public int getQuantity() { return quantity; }
	    public void setQuantity(int quantity) { this.quantity = quantity; }

	    public BigDecimal getUnitPrice() { return unitPrice; }
	    public void setUnitPrice(BigDecimal unitPrice) { this.unitPrice = unitPrice; }

		@Override
		public int hashCode() {
			return Objects.hash(produtoId, produto, quantity, unitPrice);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ItemOrdemDTO other = (ItemOrdemDTO) obj;
			return Objects.equals(produtoId, other.produtoId) && Objects.equals(produto, other.produto)
					&& quantity == other.quantity && Objects.equals(unitPrice, other.unitPrice);
		}
	    
}
