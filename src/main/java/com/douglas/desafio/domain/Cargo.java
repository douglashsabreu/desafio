package com.douglas.desafio.domain;

import java.io.Serializable;
import java.util.*;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cargo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cargo;
	
	@OneToMany(mappedBy = "cargos", cascade = CascadeType.ALL, orphanRemoval = true)
	private java.util.List<Usuario> usuarios =  new ArrayList<>();

	public Cargo() {
		super();
	}

	public Cargo(Integer id, String cargo) {
		super();
		this.id = id;
		this.cargo = cargo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public java.util.List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(java.util.List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(id, other.id);
	}
	
	

}
