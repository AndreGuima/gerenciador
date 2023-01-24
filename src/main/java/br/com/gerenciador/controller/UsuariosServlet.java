package br.com.gerenciador.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.gerenciador.model.BancoDeDados;
import br.com.gerenciador.model.Conta;
import br.com.gerenciador.model.Investimento;
import br.com.gerenciador.model.Usuario;

@WebServlet("/usuarios")
public class UsuariosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		List<Usuario> usuarios = new BancoDeDados().getUsuarios();

		String header = request.getHeader("Accept");
		System.out.println(header);
		
		if (header.contains("xml")) {
			XStream xstream = new XStream();
			xstream.alias("usuario", Usuario.class);
			xstream.alias("conta", Conta.class);
			xstream.alias("investimento", Investimento.class);
			String xml = xstream.toXML(usuarios);

			response.setContentType("application/xml");
			response.getWriter().print(xml);
		} else if (header.endsWith("json")) {
			Gson gson = new Gson();
			String json = gson.toJson(usuarios);

			response.setContentType("application/json");
			response.getWriter().print(json);
		} else {
			response.setContentType("application/json");
			response.getWriter().print("{'message':'No Content'}");
		}

	}

}
