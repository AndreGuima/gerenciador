package br.com.gerenciador.model;

import java.util.ArrayList;
import java.util.Date;

public class Conta {

	private Integer id;
	private String nome;
	private Date dataAbertura = new Date();
	private Double valorTotal;
	private ArrayList<Investimento> listaInvestimentos = new ArrayList<Investimento>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

	public Double getValorTotal() {
		valorTotal = 0d;
		for (Investimento investimento : listaInvestimentos) {
			valorTotal += investimento.getValorTotal();
		}
		return valorTotal;
	}

	public ArrayList<Investimento> getListaInvestimentos() {
		return listaInvestimentos;
	}

	public void addInvestimento(Investimento investimento) {
		this.listaInvestimentos.add(investimento);
	}
}
