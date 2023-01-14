package br.com.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.controller.action.interfaces.Acao;
import br.com.gerenciador.model.BancoDeDados;
import br.com.gerenciador.model.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String login = request.getParameter("login");
		String senha = request.getParameter("senha");		
		
		BancoDeDados bancoDeDados = new BancoDeDados();
		Usuario usuario = bancoDeDados.existeUsuario(login,senha);
		
		if (usuario != null) {
			System.out.println("Usuario valido");
			System.out.println("Logando " + login);
			
			return "redirect:entrada?acao=ListaContas";
			
		} else {
			System.out.println("Usuario invalido");
			return "redirect:entrada?acao=LoginForm";
		}		
	}

}
