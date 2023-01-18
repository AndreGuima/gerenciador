package br.com.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.controller.action.interfaces.Acao;

public class NovaContaForm implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("NovaContaForm");

		return "forward:formNovaConta.jsp";
	}

}
