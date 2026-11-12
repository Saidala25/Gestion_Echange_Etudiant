
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portail de Mobilité - ENSA Agadir</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
            background-color: #f5f7fb;
            color: #1e293b;
        }

        header {
            background-color: #ffffff;
            padding: 20px 8%;
            display: flex;
            justify-content: space-between;
            align-items: center;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.05);
        }

        .logo {
            color: #123b66;
            font-size: 22px;
            font-weight: bold;
        }

        nav a {
            text-decoration: none;
            color: #334155;
            margin-left: 25px;
            font-weight: 500;
        }

        nav a:hover {
            color: #2563eb;
        }

        .hero {
            padding: 100px 8%;
            background: linear-gradient(120deg, #123b66, #2563eb);
            color: white;
            text-align: center;
        }

        .hero h1 {
            font-size: 42px;
            margin-bottom: 20px;
        }

        .hero p {
            font-size: 18px;
            line-height: 1.7;
            max-width: 750px;
            margin: 0 auto 30px;
        }

        .btn {
            display: inline-block;
            padding: 13px 25px;
            border-radius: 6px;
            text-decoration: none;
            font-weight: bold;
            margin: 8px;
        }

        .btn-primary {
            background-color: white;
            color: #123b66;
        }

        .btn-secondary {
            border: 1px solid white;
            color: white;
        }

        .features {
            padding: 70px 8%;
            text-align: center;
        }

        .features h2 {
            font-size: 30px;
            margin-bottom: 40px;
            color: #123b66;
        }

        .cards {
            display: grid;
            grid-template-columns: repeat(3, 1fr);
            gap: 25px;
        }

        .card {
            background: white;
            padding: 30px 20px;
            border-radius: 10px;
            box-shadow: 0 3px 15px rgba(0, 0, 0, 0.06);
        }

        .card h3 {
            color: #2563eb;
            margin-bottom: 15px;
        }

        .card p {
            color: #64748b;
            line-height: 1.6;
        }

        footer {
            background-color: #123b66;
            color: white;
            text-align: center;
            padding: 22px;
            margin-top: 30px;
        }

        @media (max-width: 768px) {
            header {
                flex-direction: column;
                gap: 20px;
            }

            nav a {
                margin: 8px;
            }

            .hero h1 {
                font-size: 30px;
            }

            .cards {
                grid-template-columns: 1fr;
            }
        }
    </style>
</head>

<body>

    <header>
        <div class="logo">ENSA AGADIR</div>

        <nav>
            <a href="index.jsp">Accueil</a>
            <a href="#fonctionnalites">Fonctionnalités</a>
            <a href="login.jsp">Connexion</a>
        </nav>
    </header>

    <section class="hero">
        <h1>Portail de Mobilité Étudiante</h1>

        <p>
            Découvrez les opportunités d'échange universitaire,
            consultez les offres de mobilité et déposez vos candidatures
            à travers une plateforme centralisée dédiée aux étudiants
            de l'ENSA Agadir.
        </p>

        <a href="login.jsp" class="btn btn-primary">
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

    <footer>
        <p>
            &copy; 2026 ENSA Agadir - Portail de Mobilité Étudiante
        </p>
    </footer>

</body>
</html>
