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
    <link rel="stylesheet" href="<c:url value="https://fonts.googleapis.com/css?family=Montserrat&display=swap"/>">
    
</head>

<body>
    <header>
        <div class="caixa">
            <h1>Gerenciador de Carteira Financeira - Login</h1>

            <nav>
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="produtos.html">Produtos</a></li>
                    <li><a href="contato.html">Contato</a></li>
                </ul>
            </nav>
        </div>
    </header>
	<main>
		<h1>Realize o seu Login</h1>

		<form action="${linkEntradaServlet}" method="post">
			Login: <input type="text" name="login" />
			Senha: <input type="password" name="senha" /> <input type="hidden" name="acao" value="Login" /> <input type="submit" />
		</form>
	</main>
	<footer>        
        <p class="copyright">&copy;Copyright GCF - 2023</p>
    </footer>
</body>
</html>