package br.com.gerenciador.controller.action;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.controller.action.interfaces.Acao;
import br.com.gerenciador.model.BancoDeDados;
import br.com.gerenciador.model.Usuario;

public class NovoUsuario implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("NovoUsuario");

		String paramNomeConta = request.getParameter("nome");
		String paramLogin = request.getParameter("login");
		String paramSenha = request.getParameter("password");
		
		Usuario usuario = new Usuario();
		usuario.setNome(paramNomeConta);
		usuario.setLogin(paramLogin);
		usuario.setDataCadastro(new Date());
		usuario.setSenha(paramSenha);

		BancoDeDados banco = new BancoDeDados();
		banco.criaUsuario(usuario);		

		return "redirect:entrada?acao=LoginForm";
	}

}
