<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		Nome: <input type="text" name="nome" /> Data Abertura: <input
			type="text" name="dataAbertura" /> <input type="hidden" name="acao"
			value="NovaConta" /> <input type="submit" />
	</form>

</body>
</html>