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
	private Long id;
	private String name;
	private String perfil;
	private String email;
	private String endereco;
	
	//construir um construtor sem argumentos
	public User() {}
	//construtor com argumentos

	public User(Long id, String name, String perfil, String email, String endereco) {
		super();
		this.id = id;
		this.name = name;
		this.perfil = perfil;
		this.email = email;
		this.endereco = endereco;
	}

	public Long getId_() {
		return id;
	}

	public void setId_(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
