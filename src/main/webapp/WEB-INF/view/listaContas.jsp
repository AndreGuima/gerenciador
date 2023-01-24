<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.gerenciador.model.Conta"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GCF - Suas Contas</title>

<link rel="stylesheet" href="<c:url value="/resources/css/reset.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/style.css"/>">
<link rel="stylesheet"
	href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat&display=swap"/>">
</head>
<body>
	<header>
		<c:import url="logout.jsp" />							
		<nav>
			<ul>					
				<li><a href="${linkEntradaServlet}?acao=NovoUsuarioForm">Cadastre-se</a></li>
			</ul>
		</nav>		
	</header>
	
	
	<c:if test="${not empty conta}">
		<h2>Conta ${ conta } cadastrada com sucesso!</h2>
	</c:if>
	<h2>Lista de Contas</h2>
	<ul>
		<c:forEach items="${contas}" var="conta">			
			<li>
				${ conta.nome } - <fmt:formatDate value="${conta.dataAbertura}" pattern="dd/MM/yyyy" />
				<a href="${linkEntradaServlet}?acao=MostraConta&id=${conta.id}">Editar</a>
				<a href="${linkEntradaServlet}?acao=RemoveConta&id=${conta.id}">Remover</a>
			</li>
		</c:forEach>
	</ul>
</body>
</html>