package br.com.gerenciador.model;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

	private Integer id;
	private String nome;
	private String login;
	private String senha;
	private Double patrimonioTotal;
	private Date dataCadastro;
	private ArrayList<Conta> contas = new ArrayList<Conta>();

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ArrayList<Conta> getContas() {
		return contas;
	}

	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

	public boolean ehIgual(String login, String senha) {

		if (!this.login.equals(login)) {
			return false;
		}
		if (!this.senha.equals(senha)) {
			return false;
		}

		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getPatrimonioTotal() {

		this.patrimonioTotal = 0d;
		for (Conta conta : this.contas) {
			for (Investimento investimento : conta.getListaInvestimentos()) {
				this.patrimonioTotal += investimento.getValorTotal();
			}
		}

		return patrimonioTotal;
	}
}
