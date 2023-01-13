package br.com.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.controller.action.interfaces.Acao;
import br.com.gerenciador.model.BancoDeDados;
import br.com.gerenciador.model.Conta;

public class MostraConta implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("Mostra Conta");

		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		BancoDeDados banco = new BancoDeDados();
		Conta conta = banco.buscaById(id);
		request.setAttribute("conta", conta);

		return "forward:formAlteraConta.jsp";
	}

}
