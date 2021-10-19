package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClienteModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	private String email;
	private String cpfOuCjpj;
	private Integer tipo;
	
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpfOuCjpj() {
		return cpfOuCjpj;
	}
	public void setCpfOuCjpj(String cpfOuCjpj) {
		this.cpfOuCjpj = cpfOuCjpj;
	}
	public TipoCliente getTipo() {
		return TipoCliente.toEnum(tipo);
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}