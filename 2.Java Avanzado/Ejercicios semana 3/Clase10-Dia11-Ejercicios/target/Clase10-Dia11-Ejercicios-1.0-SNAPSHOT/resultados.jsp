
<%@page import="java.util.List"%>
<%@page import="juanmagw.hackaboss.clase10.dia11.ejercicios.logica.Voto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Resultados</title>
    </head>
    <body style="display: flex; flex-direction: column; align-items: center; justify-content: center; height: 100%;">
        <div>
            <h1>Resultados</h1>

            <table>
                <tr>
                    <th>Nombre Partido</th>
                    <th>Cantidad Votos</th>
                </tr>
                <%  List<Voto> votos = (List) request.getSession().getAttribute("votos");
                    for (Voto v : votos) {

                %>
                <tr>
                    <td><%=v.getNombre()%></td>
                    <td><%=v.getCantidad()%></td>
                </tr>
                <%}%>
            </table>
            <button class="btn-primary"><a style="color: white;" href="index.jsp"/>Volver</button>
        </div>
    </body>
</html>
