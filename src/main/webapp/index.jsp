<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<link rel="stylesheet" href="css/styleIndex.css"/>
	<title>Accueil</title> 
	
</head>

<body>

	<nav>
		<h4>ENI-Enchères</h4>
		
		<c:if test="${empty utilisateur}">
            <p>Pas d'utilisateur connecté</p>
		    <a href="SERVLET" class="lienConnection">S'inscrire - Se connecter</a>
        </c:if>
        
        <c:if test="${!empty utilisateur}">
            <p>Utilisateur connecté</p>
		    <a href="SERVLET" class="lienConnection">Enchères</a>
	    	<a href="SERVLET" class="lienConnection">Vendre un article</a>
		    <a href="SERVLET" class="lienConnection">Mon profil</a>
		    <a href="SERVLET" class="lienConnection">Déconnexion</a>
        </c:if>
		
	</nav>
	
</body>
</html>