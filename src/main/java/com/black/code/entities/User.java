package com.black.code.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_users")
public class User {
	//name, cpf, email, endereco
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idusers;
	private String nome;
	private String perfil;
	private String email;
	private String endereco;
	
	//construir um construtor sem argumentos
	public User() {}
	//construtor com argumentos

	public User(Long idusers, String nome, String perfil, String email, String endereco) {
		super();
		this.idusers = idusers;
		this.nome = nome;
		this.perfil = perfil;
		this.email = email;
		this.endereco = endereco;
	}

	public Long getId_() {
		return idusers;
	}

	public void setId_(Long idusers) {
		this.idusers = idusers;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getCpf() {
		return perfil;
	}

	public void setCpf(String cpf) {
		this.perfil = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
		
}
