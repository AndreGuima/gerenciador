package br.com.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {

	private static List<Conta> listaContas = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Conta conta1 = new Conta();
		conta1.setId(BancoDeDados.chaveSequencial++);
		conta1.setNome("PicPay");
		Conta conta2 = new Conta();
		conta2.setId(BancoDeDados.chaveSequencial++);
		conta2.setNome("ABC");
		listaContas.add(conta1);
		listaContas.add(conta2);
	}

	public void adiciona(Conta conta) {
		conta.setId(BancoDeDados.chaveSequencial++);
		BancoDeDados.listaContas.add(conta);
	}

	public List<Conta> getContas() {
		return BancoDeDados.listaContas;
	}

	public void removeById(Integer id) {

		Iterator<Conta> it = listaContas.iterator();
		while (it.hasNext()) {
			Conta emp = it.next();
			if (emp.getId() == id) {
				it.remove();
			}
		}

	}

	public Conta buscaById(Integer id) {
		for (Conta conta : listaContas) {
			if (conta.getId() == id) {
				return conta;
			}
		}
		return null;
	}

}
