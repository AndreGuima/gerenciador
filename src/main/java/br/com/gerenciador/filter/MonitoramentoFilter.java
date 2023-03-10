package br.com.gerenciador.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter(urlPatterns = "/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain fchain) throws IOException, ServletException {

		System.out.println("MonitoramentoFilter");

		long antesTimeMillis = System.currentTimeMillis();
		String acao = request.getParameter("acao");

		// segue adiante, executa a action
		fchain.doFilter(request, response);

		long depoisTimeMillis = System.currentTimeMillis();
		System.out.println("tempo de execução da ação: " + acao + ": " + (depoisTimeMillis - antesTimeMillis));
	}

}
