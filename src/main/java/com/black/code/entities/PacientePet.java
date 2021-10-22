package com.black.code.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_pacientpets")
public class PacientePet {
	//nome, procedência, espécie e sexo
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idpets;
	private String nome;
	private String procedencia;
	private String especie;
	private String sexo;
	private Integer idade;
	public PacientePet(Long idpets, String nome, String procedencia, String especie, String sexo, Integer idade) {
		super();
		this.idpets = idpets;
		this.nome = nome;
		this.procedencia = procedencia;
		this.especie = especie;
		this.sexo = sexo;
		this.idade = idade;
	}
	public Long getId() {
		return idpets;
	}
	public void setId(Long idpets) {
		this.idpets = idpets;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProcedencia() {
		return procedencia;
	}
	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}
 
