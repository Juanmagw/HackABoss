<%-- 
    Document   : index
    Created on : 20 mar 2024, 16:57:39
    Author     : juanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>JSP Page</title>
    </head>
    <body style="display: flex; flex-direction: column; justify-content: center; align-items: center; height: 100%; text-align: center">
        <h1>Bienvenido al organizador de torneos</h1>

        <h3>Cree los equipos y los partidos</h3>

        <h2>Crear equipo</h2>
        <form action="EquipoSv" method="POST">
            <div>
                <label>Nombre del equipo</label>
                <input type="text" name="nombreEquipo"/>
            </div>
            <div>
                <label>Ciudad del equipo</label>
                <input type="text" name="ciudadEquipo"/>
            </div>
            <button class="btn-primary mt-3" type="submit">Crear Equipo</button>
        </form>
        <form action="EquipoSv" method="GET">
            <button class="btn-success mt-3" type="submit">Mostrar Equipos</button>
        </form>

        <h2>Crear partido</h2>
        <form action="PartidoSv" method="POST">
            <div>
                <label>Nombre del partido</label>
                <input type="text" name="nombrePartido"/>
            </div>
            <div>
                <label>Fecha del partido</label>
                <input type="text" name="fechaPartido"/>
            </div>
            <div>
                <label>ID Equipo 1</label>
                <input type="number" name="idPartidoEquipo1"/>
            </div>
            <div>
                <label>ID Equipo 2</label>
                <input type="number" name="idPartidoEquipo2"/>
            </div>
            <div>
                <label>Puntuación del equipo 1</label>
                <input type="number" name="puntuacionPartidoEquipo1"/>
            </div>
            <div>
                <label>Puntuación del equipo 2</label>
                <input type="number" name="puntuacionPartidoEquipo2"/>
            </div>
            <button class="btn-primary mt-3" type="submit">Crear Partido</button>
        </form>
        <form action="PartidoSv" method="GET">
            <button class="btn-success mt-3" type="submit">Mostrar Partidos</button>
        </form>
    </body>
</html>
