<%@page import="juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica.Partido"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Equipos</title>
    </head>
    <body style="display: flex; flex-direction: column; justify-content: center; align-items: center; height: 100%; text-align: center">
        <h1>Equipos</h1>
        <table>
            <tr>
                <th>Nombre</th>
                <th>Fecha</th>
                <th>Equipo 1</th>
                <th>Equipo 2</th>
                <th>Puntuación Equipo 1</th>
                <th>Puntuación Equipo 2</th>
            </tr>
            <%List<Partido> partidos = (List) request.getSession().getAttribute("partidos");
                partidos.forEach(e -> System.out.println(e.getNombre()));
                for (Partido p : partidos) {
            %>
            <tr>
                <td><%=p.getNombre()%></td>
                <td><%=p.getFecha()%></td>
                <td><%=p.getEquipo1().getNombre()%></td>
                <td><%=p.getEquipo2().getNombre()%></td>
                <td><%=p.getPuntuacionEquipo1()%></td>
                <td><%=p.getPuntuacionEquipo2()%></td>
            </tr>
            <%}%>
        </table>
        <button class="btn-primary mt-3"><a style="color: white;" href="index.jsp"/>Volver</button>
    </body>
</html>
