package com.fabio.my_api_rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "CARRO")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Carro{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="NOME" )
	private String nome;
	@Column(name="COR" )
	private String cor;
	@Column(name="DATA_FABRICACAO" )
	private Date data_fab;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Date getData_fab() {
		return data_fab;
	}
	public void setData_fab(Date data_fab) {
		this.data_fab = data_fab;
	}
	
	
	
}
