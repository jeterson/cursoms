package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Estado;

public class EstadoDTO {

	private Integer id;
	private String nome;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoDTO() {
		// TODO Auto-generated constructor stub
	}

	public EstadoDTO(Estado estado) {
		super();
		this.id = estado.getId();
		this.nome = estado.getNome();
	}
	
	
	
	
}
