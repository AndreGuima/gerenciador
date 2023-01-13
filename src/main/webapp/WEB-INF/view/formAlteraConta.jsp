<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nova Conta</title>
</head>
<body>
	Cadastro de nova conta

	<form action="${linkEntradaServlet}" method="post">
		Nome: <input type="text" name="nome" value="${conta.nome}" /> Data
		Abertura: <input type="text" name="dataAbertura"
			value="<fmt:formatDate value="${conta.dataAbertura}" pattern="dd/MM/yyyy" />" />
		<input type="hidden" name="id" value="${conta.id }" /> <input
			type="hidden" name="acao" value="AlteraConta" /> <input
			type="submit" />
	</form>

</body>
</html>