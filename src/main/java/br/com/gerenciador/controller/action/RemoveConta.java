package br.com.gerenciador.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gerenciador.controller.action.interfaces.Acao;
import br.com.gerenciador.model.BancoDeDados;
import br.com.gerenciador.model.Usuario;

public class RemoveConta implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sessao = request.getSession();
		Usuario usuarioLogado = (Usuario) sessao.getAttribute("usuarioLogado");
		if (usuarioLogado != null) {
			String paramId = request.getParameter("id");
			Integer id = Integer.valueOf(paramId);

			BancoDeDados banco = new BancoDeDados();
			banco.removeContaById(usuarioLogado, id);
		}

		return "redirect:entrada?acao=ListaContas";
	}

}
