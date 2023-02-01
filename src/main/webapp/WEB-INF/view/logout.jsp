<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

Gerenciador de Carteira Financeira
<c:if test="${not empty usuarioLogado}">
	- Bem-vindo(a): ${ usuarioLogado.login }
	<a href="entrada?acao=Logout">Sair</a>
</c:if>