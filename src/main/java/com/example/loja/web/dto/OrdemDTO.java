package com.example.loja.web.dto;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;
import java.util.Objects;

import com.example.loja.dominio.modelos.ItemOrdem;

public class OrdemDTO {
	Long id;
	Long userId;
	List<ItemOrdemDTO> items;
	BigDecimal total;
	Instant createdAt;
	
	public OrdemDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public OrdemDTO(Long id, Long userId, List<ItemOrdemDTO> items, BigDecimal total, Instant createdAt) {
		super();
		this.id = id;
		this.userId = userId;
		this.items = items;
		this.total = total;
		this.createdAt = createdAt;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public List<ItemOrdemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemOrdemDTO> items) {
		this.items = items;
	}
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Instant getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(createdAt, id, items, total, userId);
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrdemDTO other = (OrdemDTO) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(id, other.id)
				&& Objects.equals(items, other.items) && Objects.equals(total, other.total)
				&& Objects.equals(userId, other.userId);
	}
	
	
}
