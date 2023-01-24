<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width">
<title>GCF - Login</title>

<link rel="stylesheet" href="<c:url value="/resources/css/reset.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<link rel="stylesheet"
	href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat&display=swap"/>">

</head>

<body>
	<header>					
		<nav>
			<ul>					
				<li><a href="${linkEntradaServlet}?acao=NovoUsuarioForm">Cadastre-se</a></li>
			</ul>
		</nav>		
	</header>
	<main>
		<div class="caixa">
			<form action="${linkEntradaServlet}" method="post">
				<label for="login">Login</label>
				<input type="text" id="login" name="login" class="input-padrao" required>
				<label for="password">Senha</label>
				<input type="password" id="password" name="password" class="input-padrao" required>
				<input type="hidden" name="acao" value="Login" /> <input type="submit" />
			</form>
		</div>
	</main>
</body>
</html>