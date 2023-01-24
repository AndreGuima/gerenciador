<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<title>GCF - Nova Conta</title>

<link rel="stylesheet" href="<c:url value="/resources/css/reset.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<link rel="stylesheet"
	href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat&display=swap"/>">

</head>
<body>
	<header>
		<div class="caixa">
			<nav>
				<ul>
					<li><a href="${linkEntradaServlet}?acao=ListaContas">Minhas
							Contas</a></li>
					<li><c:import url="logout.jsp" /></li>
				</ul>
			</nav>
		</div>
	</header>
	<main>
		<div class="caixa">
			<form action="${linkEntradaServlet}" method="post">
				<label for="nome">Nome da conta</label> <input type="text" id="nome"
					name="nome" class="input-padrao" required> <input
					type="hidden" name="acao" value="NovaConta" /> <input
					type="submit" />
			</form>
		</div>
	</main>
</body>
</html>