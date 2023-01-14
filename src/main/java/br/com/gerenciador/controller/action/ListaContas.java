package br.com.gerenciador.controller.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.gerenciador.controller.action.interfaces.Acao;
import br.com.gerenciador.model.BancoDeDados;
import br.com.gerenciador.model.Conta;
import br.com.gerenciador.model.Usuario;

public class ListaContas implements Acao {

	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BancoDeDados banco = new BancoDeDados();
		List<Usuario> usuarios = banco.getUsuarios();
		
		List<Conta> lista = usuarios.get(0).getContas();

		request.setAttribute("contas", lista);

		return "forward:listaContas.jsp";
	}

}
