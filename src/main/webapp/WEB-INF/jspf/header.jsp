<%@ page import="com.example.util.SessionConstants" %>
<%--
  EN-TÊTE COMMUN. Usage dans une page :

    <%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <% request.setAttribute("pageTitle", "Mes candidatures"); %>
    <%@ include file="/WEB-INF/jspf/header.jsp" %>
    ... contenu de la page (dans <div class="container">) ...
    <%@ include file="/WEB-INF/jspf/footer.jsp" %>

  URLs de navigation (à créer par A et B, voir le document de répartition) :
    /login  /register  /logout
    /etudiant/offres  /etudiant/candidatures
    /responsable/dashboard
    /admin/dashboard
--%>
<%
    String ctx = request.getContextPath();
    String role = (String) session.getAttribute(SessionConstants.ROLE);
    Object utilisateur = session.getAttribute(SessionConstants.UTILISATEUR);
%>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${empty pageTitle ? 'Portail de Mobilité' : pageTitle} - ENSA Agadir</title>
    <link rel="stylesheet" href="<%= ctx %>/css/style.css">
</head>
<body>

<header>
    <a class="logo" href="<%= ctx %>/index.jsp">ENSA AGADIR</a>

    <nav>
        <a href="<%= ctx %>/index.jsp">Accueil</a>

        <% if (SessionConstants.ROLE_ETUDIANT.equals(role)) { %>
            <a href="<%= ctx %>/etudiant/offres">Offres</a>
            <a href="<%= ctx %>/etudiant/candidatures">Mes candidatures</a>
        <% } else if (SessionConstants.ROLE_RESPONSABLE.equals(role)) { %>
            <a href="<%= ctx %>/responsable/dashboard">Tableau de bord</a>
        <% } else if (SessionConstants.ROLE_ADMINISTRATEUR.equals(role)) { %>
            <a href="<%= ctx %>/admin/dashboard">Administration</a>
        <% } %>

        <% if (utilisateur == null) { %>
            <a href="<%= ctx %>/login">Connexion</a>
        <% } else { %>
            <a href="<%= ctx %>/logout">Déconnexion</a>
        <% } %>
    </nav>
</header>

<main>
