<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/entrada" var="linkEntradaServlet" />

<!DOCTYPE html>
<html lang="pt-br">

	<head>
		<meta charset="UTF-8">		
		<title>GCF - Alterar Conta</title>
		<link rel="icon" href="<c:url value="/resources/img/favicon.ico"/>" type="image/x-icon">
		<link rel="stylesheet" href="<c:url value="/resources/css/reset.css"/>">
		<link rel="stylesheet" href="<c:url value="/resources/css/index.css"/>">	
	
	</head>
<body>
	<header>					
		<div class="header">				
			<a class="logo" href="${linkEntradaServlet}?acao=LoginForm"><img class="logo" alt="GCF Logo" src="<c:url value="/resources/img/favicon.ico"/>"/></a>								
			<div class="header-right">			
				<a href="${linkEntradaServlet}?acao=LoginForm">Home</a>		
				<a href="${linkEntradaServlet}?acao=NovoUsuarioForm">Cadastro</a>
				<a class="active" href="${linkEntradaServlet}?acao=ListaContas">Carteira</a>
				<a href="#about">Sobre</a>
			</div>
		</div>					
	</header>
	<main>
		<section class="container">
			<h2>Minha Conta</h2>

			<form action="${linkEntradaServlet}" method="post">
				<label for="nome">Nome da Conta</label>
				<input type="text" id="nome" name="nome" value="${conta.nome}" class="input-padrao" required>
				<label for="dataAbertura">Data de Cadastro</label>
				<input type="text" name="dataAbertura" value="<fmt:formatDate value="${conta.dataAbertura}" pattern="dd/MM/yyyy" />" class="input-padrao" required>
				<input type="hidden" name="id" value="${conta.id }" />
				<input type="hidden" name="acao" value="AlteraConta" />
				<input type="submit" />
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