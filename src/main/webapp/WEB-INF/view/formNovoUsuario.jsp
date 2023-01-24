<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet" />
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
		<div class="caixa">			
			<nav>
				<ul>
					<li><a href="${linkEntradaServlet}?acao=LoginForm">Entrar</a></li>
				</ul>
			</nav>			
		</div>
	</header>
	<main>
		<div class="caixa">
			<form action="${linkEntradaServlet}" method="post">
				<label for="nome">Nome</label>
				<input type="text" id="nome" name="nome" class="input-padrao" required>
				<label for="login">Login</label>
				<input type="text" id="login" name="login" class="input-padrao" required>
				<label for="password">Senha</label>
				<input type="password" id="password" name="password" class="input-padrao" required>
				<input type="hidden" name="acao" value="NovoUsuario" /> <input type="submit" />
			</form>
		</div>
	</main>
</body>
</html>