<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.gerenciador.model.Conta"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<c:url value="/entrada" var="linkEntradaServlet"/>

<!DOCTYPE html>
<html lang="pt-br">

	<head>
		<meta charset="UTF-8">		
		<title>GCF - Minhas Contas</title>
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
				<c:if test="${not empty conta}">
					<h2>Conta ${ conta } cadastrada com sucesso!</h2>
				</c:if>
				<h2>Lista de Contas</h2>
				<table>
					<thead>
						<tr>
							<th>Nome</th>
							<th>Valor Total(R$)</th>
							<th>Data de Cadastro</th>
							<th>Editar</th>
							<th>Excluir</th>							
						</tr>
					</thead>
					<tbody id="tabela-pacientes">
						<c:forEach items="${contas}" var="conta">
							<tr class="paciente" >
								<td class="info-nome">${ conta.nome }</td>
								<td class="info-peso">${ conta.valorTotal }</td>
								<td class="info-imc"><fmt:formatDate value="${conta.dataAbertura}" pattern="dd/MM/yyyy" /></td>
								<td class="info-altura"><a href="${linkEntradaServlet}?acao=MostraConta&id=${conta.id}">Editar</a></td>
								<td class="info-gordura"><a href="${linkEntradaServlet}?acao=RemoveConta&id=${conta.id}">Remover</a></td>								
							</tr>
						</c:forEach>
					</tbody>
				</table>				
			</section>
		</main>
		<footer>				
		 	<div class="container">
				<h2><c:import url="logout.jsp" /></h2>
			</div>
		</footer>
	</body>
</html>