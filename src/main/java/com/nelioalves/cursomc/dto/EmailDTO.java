package com.nelioalves.cursomc.dto;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class EmailDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message="Preenchimento Obrigatório")
	private String email;
	
	public EmailDTO() {

	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
