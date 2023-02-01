package br.com.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BancoDeDados {

	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static List<Conta> listaContas = new ArrayList<>();
	private static List<Investimento> listaInvestimentos = new ArrayList<>();
	private static Integer chaveSequencialConta = 1;
	private static Integer chaveSequencialUsuario = 1;

	static {
		try {
			Investimento inv1 = new Investimento();
			inv1.setNome("CDI 102%");
			inv1.setValorTotal(30000d);
			listaInvestimentos.add(inv1);

			Conta conta1 = new Conta();
			conta1.setId(BancoDeDados.chaveSequencialConta++);
			conta1.setNome("PicPay");
			conta1.addInvestimento(inv1);
			listaContas.add(conta1);

			Usuario usuario1 = new Usuario();
			usuario1.setId(chaveSequencialUsuario++);
			usuario1.setNome("André de Paiva");
			usuario1.setLogin("andre");
			usuario1.setSenha("321654");
			usuario1.addConta(conta1);
			listaUsuarios.add(usuario1);

			Investimento inv2 = new Investimento();
			inv2.setNome("Tesouro Direto IPCA+2035");
			inv2.setValorTotal(2000d);
			listaInvestimentos.add(inv2);

			Conta conta2 = new Conta();
			conta2.setId(BancoDeDados.chaveSequencialConta++);
			conta2.setNome("Nubank");
			conta2.addInvestimento(inv2);
			listaContas.add(conta2);
			
			Investimento inv3 = new Investimento();
			inv3.setNome("Nu Caixinha");
			inv3.setValorTotal(150d);
			listaInvestimentos.add(inv3);
			
			Conta conta3 = new Conta();
			conta3.setId(BancoDeDados.chaveSequencialConta++);
			conta3.setNome("Pagbank");		
			conta3.addInvestimento(inv3);
			listaContas.add(conta3);

			Usuario usuario2 = new Usuario();
			usuario2.setId(chaveSequencialUsuario++);
			usuario2.setNome("Fernanda Gabriele");
			usuario2.setLogin("fernanda");
			usuario2.setSenha("123456");
			usuario2.addConta(conta2);
			usuario2.addConta(conta3);
			listaUsuarios.add(usuario2);

		} catch (Exception e) {
			System.out.println("erro: " + e.getMessage());
			e.printStackTrace();
		}
	}

	public void adicionaConta(Usuario usuario, Conta conta) {
		conta.setId(BancoDeDados.chaveSequencialConta++);
		BancoDeDados.listaContas.add(conta);
		usuario.addConta(conta);
	}
	
	public void criaUsuario(Usuario usuario) {
		usuario.setId(BancoDeDados.chaveSequencialUsuario++);
		BancoDeDados.listaUsuarios.add(usuario);		
	}

	public List<Usuario> getUsuarios() {
		return BancoDeDados.listaUsuarios;
	}

	public void removeContaById(Usuario usuarioLogado, Integer id) {

		Iterator<Conta> it = usuarioLogado.getContas().iterator();
		while (it.hasNext()) {
			Conta conta = it.next();
			if (conta.getId() == id) {
				it.remove();
			}
		}

	}

	public Conta buscaContaById(Integer id) {
		for (Conta conta : listaContas) {
			if (conta.getId() == id) {
				return conta;
			}
		}
		return null;
	}

	public Usuario validaCredenciaisUsuario(String login, String senha) {

		for (Usuario usuario : listaUsuarios) {
			if (usuario.ehIgual(login, senha)) {
				return usuario;
			}
		}

		return null;
	}

}
