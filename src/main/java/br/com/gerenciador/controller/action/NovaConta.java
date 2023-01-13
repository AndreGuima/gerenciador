package br.com.gerenciador.controller.action;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.controller.action.interfaces.Acao;
import br.com.gerenciador.model.BancoDeDados;
import br.com.gerenciador.model.Conta;

public class NovaConta implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Nova Conta");

		String paramNomeConta = request.getParameter("nome");
		String paramDataAbertura = request.getParameter("dataAbertura");

		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(paramDataAbertura);
		} catch (ParseException e) {
			throw new ServletException();
		}

		Conta conta = new Conta();
		conta.setNome(paramNomeConta);
		conta.setDataAbertura(dataAbertura);

		BancoDeDados banco = new BancoDeDados();
		banco.adiciona(conta);
		request.setAttribute("conta", conta.getNome());

		return "redirect:entrada?acao=ListaContas";
	}

}
