package com.aplication.xmlProcess.Model;

import java.util.List;

import javax.persistence.*;

public class Agente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;

	@Column
	private String data;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "agente_id")
	private List<Regiao> regioes;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Regiao> getRegioes() {
		return regioes;
	}

	public void setRegioes(List<Regiao> regioes) {
		this.regioes = regioes;
	}

}
