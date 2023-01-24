package br.com.gerenciador.controller.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gerenciador.controller.action.interfaces.Acao;
import br.com.gerenciador.model.BancoDeDados;
import br.com.gerenciador.model.Conta;
import br.com.gerenciador.model.Usuario;

public class NovaConta implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("NovaConta");

		HttpSession sessao = request.getSession();
		Usuario usuarioLogado = (Usuario) sessao.getAttribute("usuarioLogado");
		String paramNomeConta = request.getParameter("nome");

		Conta conta = new Conta();		
		conta.setNome(paramNomeConta);
		conta.setDataAbertura(new Date());

		BancoDeDados banco = new BancoDeDados();
		banco.adicionaConta(usuarioLogado, conta);
		request.setAttribute("conta", conta.getNome());

		return "redirect:entrada?acao=ListaContas";
	}

}
