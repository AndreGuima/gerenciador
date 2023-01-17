<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Nova Conta</title>
</head>
<body>
	<h1>
		Cadastro de nova conta
		<c:import url="logout.jsp" />
	</h1>

	<form action="${linkEntradaServlet}" method="post">
		Nome: <input type="text" name="nome" /> Data Abertura: <input
			type="text" name="dataAbertura" /> <input type="hidden" name="acao"
			value="NovaConta" /> <input type="submit" />
	</form>

</body>
</html>