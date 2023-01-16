package br.com.gerenciador.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.gerenciador.controller.action.interfaces.Acao;
import br.com.gerenciador.model.Conta;
import br.com.gerenciador.model.Usuario;

public class ListaContas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession sessao = request.getSession();
		if (sessao.getAttribute("usuarioLogado") == null) {
			return "redirect:entrada?acao=LoginForm";
		}
		
		Usuario usuarioLogado = (Usuario) sessao.getAttribute("usuarioLogado");
		List<Conta> lista = usuarioLogado.getContas();
		request.setAttribute("contas", lista);
		return "forward:listaContas.jsp";
		
	}

}
