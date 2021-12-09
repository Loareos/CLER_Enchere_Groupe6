<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<meta author="Clément"/>
	<style type="text/css"><%@include file="../../../css/styleConnexion.css"%></style>
	<title>Profil</title> 
	
</head>

<header>

    <nav>
		<h4>ENI-Enchères</h4> 
		
	</nav>
	
</header>
<body>

	<!-- Comparer les id -->
    <c:if test="${ProfilAffiche != utilisateurActuel}">   
	   <h3><%=request.getParameter("pseudo")%></h3> 
    </c:if>
    
    <c:if test="${ProfilAffiche == utilisateurActuel}">   
	   <h3>Mon profil</h3> 
    </c:if>

    <div class="profilInfos">
    <div class="profil">
        <label>Pseudo : </label>
        <label><%=request.getParameter("pseudo")%></label>
    </div>
    <c:if test="${ProfilAffiche == utilisateurActuel}">   
	    <div class="profil">
        <label>Nom : </label>
        <label><%=request.getParameter("Nom")%></label>
    </div>
    <div class="profil">
        <label>Prénom : </label>
        <label><%=request.getParameter("Prenom")%></label>
    </div>
    <div class="profil">
        <label>Email : </label>
        <label><%=request.getParameter("Email")%></label>
    </div>
    <div class="profil">
        <label>Téléphone : </label>
        <label><%=request.getParameter("Telephone")%></label> 
    </div>
    <div class="profil">
        <label>Rue : </label>
        <label><%=request.getParameter("Rue")%></label>
    </div>
    </c:if>
    <div class="profil">
        <label>Code postal : </label>
        <label><%=request.getParameter("CodePostal")%></label>
    </div>
    <div class="profil">
        <label>Ville : </label>
        <label><%=request.getParameter("Ville")%></label>
    </div>
	</div>
	
	
	
	<!-- Comparer les id -->
	 <c:if test="${ProfilAffiche == utilisateurActuel}">
        <form action="ModificationProfil" class="btn"><!-- SERVLET a rajouter -->
		    <button type="submit">Modifier</button>
	    </form>
     </c:if>
     
     <form action="ModificationProfil" class="btnRetour">
		    <button type="submit" onclick="history.back()">Retour</button>
	 </form>
	
</body>
</html>