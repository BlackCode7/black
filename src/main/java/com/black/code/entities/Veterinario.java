package com.black.code.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_veterinarios")
public class Veterinario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idveterinarios;
	private String nome;
	private String telefone;
	private String email;
	private Double crmv;
	public Veterinario(Long idveterinarios, String nome, String telefone, String email, Double crmv) {
		super();
		this.idveterinarios = idveterinarios;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.crmv = crmv;
	}
	public Long getId() {
		return idveterinarios;
	}
	public void setId(Long idveterinarios) {
		this.idveterinarios = idveterinarios;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getCrmv() {
		return crmv;
	}
	public void setCrmv(Double crmv) {
		this.crmv = crmv;
	}
	
	
	
}
