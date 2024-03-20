<%@page import="java.util.List"%>
<%@page import="juanmagw.hackaboss.ejerciciointegradorjsp.jpa.logica.Equipo"%>
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
                <th>Ciudad</th>
            </tr>
            <%List<Equipo> equipos = (List) request.getSession().getAttribute("equipos");
                equipos.forEach(e -> System.out.println(e.getNombre()));
                for (Equipo e : equipos) {
            %>
            <tr>
                <td><%=e.getNombre()%></td>
                <td><%=e.getCiudad()%></td>
            </tr>
            <%}%>
        </table>
        <button class="btn-primary mt-3"><a style="color: white;" href="index.jsp"/>Volver</button>
    </body>
</html>
