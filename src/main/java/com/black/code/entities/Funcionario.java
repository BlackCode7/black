package com.black.code.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_funcionarios")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idfunciona;
	private String nome;
	private String cpf;
	private String telefone;
	private Double salario;
	private String email;
	private String endereco;
	
	public Funcionario(Long idfunciona, String nome, String cpf, String telefone, Double salario, String email,
			String endereco) {
		super();
		this.idfunciona = idfunciona;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.salario = salario;
		this.email = email;
		this.endereco = endereco;
	}

	public Long getId() {
		return idfunciona;
	}

	public void setId(Long idfunciona) {
		this.idfunciona = idfunciona;
	}

	public String getName() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
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
