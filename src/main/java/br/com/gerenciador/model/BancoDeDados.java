package br.com.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {

	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static List<Conta> listaContas = new ArrayList<>();
	private static List<Investimento> listaInvestimentos = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {				
		try {
			Investimento inv1 = new Investimento();
			inv1.setNome("CDI 102%");
			inv1.setValorTotal(30000d);
			listaInvestimentos.add(inv1);
			
			Conta conta1 = new Conta();
			conta1.setId(BancoDeDados.chaveSequencial++);
			conta1.setNome("PicPay");
			conta1.addInvestimento(inv1);
			listaContas.add(conta1);
			
			Usuario andre = new Usuario();
			andre.setLogin("andre");
			andre.setSenha("321654");
			andre.addConta(conta1);
			listaUsuarios.add(andre);	
			
			Investimento inv2 = new Investimento();
			inv2.setNome("Tesouro Direto IPCA+2035");
			inv2.setValorTotal(20000d);
			listaInvestimentos.add(inv2);
			
			Conta conta2 = new Conta();
			conta2.setId(BancoDeDados.chaveSequencial++);
			conta2.setNome("Nubank");
			conta2.addInvestimento(inv2);
			listaContas.add(conta2);
			
			Usuario fernanda = new Usuario();
			fernanda.setLogin("fernanda");
			fernanda.setSenha("123456");
			fernanda.addConta(conta2);
			listaUsuarios.add(fernanda);
			
		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void adiciona(Conta conta) {
		conta.setId(BancoDeDados.chaveSequencial++);
		BancoDeDados.listaContas.add(conta);
	}

	public List<Usuario> getUsuarios() {
		return BancoDeDados.listaUsuarios;
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

	public Usuario existeUsuario(String login, String senha) {

		for (Usuario usuario : listaUsuarios) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}
		
		return null;
	}

}






















