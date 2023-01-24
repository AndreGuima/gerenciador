<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>GCF - Alterar Conta</title>

<link rel="stylesheet" href="<c:url value="/resources/css/reset.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<link rel="stylesheet"
	href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat&display=swap"/>">
	
</head>
<body>
	<h1>
		Cadastro de nova conta
		<c:import url="logout.jsp" />
	</h1>

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