<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Nova Conta Criada</title>
</head>
<body>
	<c:if test="${not empty conta}">
		Conta ${ conta } cadastrada com sucesso!
	</c:if>
	
	<c:if test="${empty conta}">
		Nenhuma conta cadastrada ainda.
	</c:if>
</body>
</html>