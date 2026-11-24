<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<% request.setAttribute("pageTitle", "Portail de Mobilité"); %>
<%@ include file="/WEB-INF/jspf/header.jsp" %>

    <section class="hero">
        <h1>Portail de Mobilité Étudiante</h1>

        <p>
            Découvrez les opportunités d'échange universitaire,
            consultez les offres de mobilité et déposez vos candidatures
            à travers une plateforme centralisée dédiée aux étudiants
            de l'ENSA Agadir.
        </p>

        <a href="<%= request.getContextPath() %>/login" class="btn btn-primary">
            Se connecter
        </a>

        <a href="#fonctionnalites" class="btn btn-secondary">
            Découvrir le portail
        </a>
    </section>

    <section class="features" id="fonctionnalites">

        <h2>Les fonctionnalités du portail</h2>

        <div class="cards">

            <div class="card">
                <h3>Offres de mobilité</h3>
                <p>
                    Consultez les différentes opportunités
                    d'échange proposées par les universités partenaires.
                </p>
            </div>

            <div class="card">
                <h3>Candidatures en ligne</h3>
                <p>
                    Déposez vos candidatures et transmettez
                    les documents nécessaires directement sur la plateforme.
                </p>
            </div>

            <div class="card">
                <h3>Suivi des candidatures</h3>
                <p>
                    Consultez l'état de vos candidatures
                    et suivez leur évolution.
                </p>
            </div>

        </div>
    </section>

<%@ include file="/WEB-INF/jspf/footer.jsp" %>
