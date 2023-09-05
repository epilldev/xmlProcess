package com.aplication.xmlProcess.Model;

import java.util.List;

import javax.persistence.*;

public class Regiao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String sigla;

	@ElementCollection
	@CollectionTable(name = "geracao", joinColumns = @JoinColumn(name = "regiao_id"))
	@Column(name = "valor")
	private List<Double> geracao;

	@ElementCollection
	@CollectionTable(name = "compra", joinColumns = @JoinColumn(name = "regiao_id"))
	@Column(name = "valor")
	private List<Double> compra;

	@ElementCollection
	@CollectionTable(name = "preco_medio", joinColumns = @JoinColumn(name = "regiao_id"))
	@Column(name = "valor")
	private List<Double> precoMedio;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public List<Double> getGeracao() {
		return geracao;
	}

	public void setGeracao(List<Double> geracao) {
		this.geracao = geracao;
	}

	public List<Double> getCompra() {
		return compra;
	}

	public void setCompra(List<Double> compra) {
		this.compra = compra;
	}

	public List<Double> getPrecoMedio() {
		return precoMedio;
	}

	public void setPrecoMedio(List<Double> precoMedio) {
		this.precoMedio = precoMedio;
	}

}
