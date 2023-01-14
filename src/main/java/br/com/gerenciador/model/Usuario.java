package br.com.gerenciador.model;

import java.util.ArrayList;

public class Usuario {

	private String login;
	private String senha;
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
}
