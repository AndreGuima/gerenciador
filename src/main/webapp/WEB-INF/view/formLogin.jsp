<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html lang="pt-br">

	<head>
		<meta charset="UTF-8">		
		<title>GCF - Login</title>
		<link rel="icon" href="<c:url value="/resources/img/favicon.ico"/>" type="image/x-icon">
		<link rel="stylesheet" href="<c:url value="/resources/css/reset.css"/>">
		<link rel="stylesheet" href="<c:url value="/resources/css/index.css"/>">	
	
	</head>	
	<body>
		<header>					
			<div class="header">				
				<a class="logo" href="${linkEntradaServlet}?acao=LoginForm"><img class="logo" alt="GCF Logo" src="<c:url value="/resources/img/favicon.ico"/>"/></a>								
				<div class="header-right">			
					<a class="active" href="${linkEntradaServlet}?acao=LoginForm">Home</a>		
					<a href="${linkEntradaServlet}?acao=NovoUsuarioForm">Cadastro</a>
					<a href="${linkEntradaServlet}?acao=ListaContas">Carteira</a>
					<a href="#about">Sobre</a>
				</div>
			</div>					
		</header>
		<main>
			<section class="container">													
				<h2>Login</h2>
				<form action="${linkEntradaServlet}" method="post">
					<label for="login">Login</label>
					<input type="text" id="login" name="login" class="input-padrao" required>
					<label for="password">Senha</label>
					<input type="password" id="password" name="password" class="input-padrao" required>
					<input type="hidden" name="acao" value="Login" /> <input type="submit" />
				</form>
			
			</section>									
		</main>
		<footer>				
		 	<div class="container">
				<h2><c:import url="logout.jsp" /></h2>
			</div>
		</footer>
	</body>
</html>