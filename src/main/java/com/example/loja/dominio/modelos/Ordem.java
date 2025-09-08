package com.example.loja.dominio.modelos;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ordens")
public class Ordem {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(optional = false)
	private Usuario usuarios;
	
	@OneToMany(mappedBy = "ordem", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ItemOrdem> items = new ArrayList<>();
	
	private BigDecimal total;
	
	private Instant createdAt = Instant.now();
	
	public Ordem() {
		
	}

	public Ordem(Long id, Usuario usuarios, List<ItemOrdem> items, BigDecimal total, Instant createdAt) {
		super();
		this.id = id;
		this.usuarios = usuarios;
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

	public Usuario getUser() {
		return usuarios;
	}

	public void setUser(Usuario usuarios) {
		this.usuarios = usuarios;
	}

	public List<ItemOrdem> getItems() {
		return items;
	}

	public void setItems(List<ItemOrdem> list) {
		this.items = list;
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
		return Objects.hash(createdAt, id, items, total, usuarios);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ordem other = (Ordem) obj;
		return Objects.equals(createdAt, other.createdAt) && Objects.equals(id, other.id)
				&& Objects.equals(items, other.items) && Objects.equals(total, other.total)
				&& Objects.equals(usuarios, other.usuarios);
	}
	
}
