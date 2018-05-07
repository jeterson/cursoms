package com.nelioalves.cursomc.dto;

import com.nelioalves.cursomc.domain.Cidade;

public class CidadeDTO {

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
	public void setNome(String descricao) {
		this.nome = descricao;
	}
	public CidadeDTO(Integer id, String descricao) {
		super();
		this.id = id;
		this.nome = descricao;
	}
	
	
	public CidadeDTO() {

	}
	
	public CidadeDTO(Cidade cidade) {
		this.id = cidade.getId();
		this.nome = cidade.getNome();
	}
}
