<%-- 
    Document   : index
    Created on : 20 mar 2024, 8:27:35
    Author     : juanm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html style="height: 100%">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Votación</title>
    </head>
    <body style="display: flex; align-content: center; justify-content: center; height: 100%">
        <div style="display: flex; flex-direction: column; align-content: center; justify-content: center; height: 100%">
            <form action="VotoSv" method="POST">
                <div>
                    <h1 style="font-weight: bolder">Votación</h1>
                </div>
                <div>
                    <p>Elija su voto:</p>
                </div>           
                <div>
                    <div>
                        <input style="margin-right: 5px" type="radio" value="A" name="partido"/>Partido A
                    </div>
                    <div>
                        <input style="margin-right: 5px" type="radio" value="B" name="partido"/>Partido B
                    </div>
                    <div>
                        <input style="margin-right: 5px" type="radio" value="C" name="partido"/>Partido C
                    </div>
                </div>
                <div>
                    <button class="btn btn-primary mt-2" type="submit">Votar</button>
                </div>
            </form>
            <form action="VotoSv" method="GET">
                <button class="btn btn-success mt-4" type="submit">Mostrar resultados</button>           
            </form>
        </div>

    </body>
</html>
