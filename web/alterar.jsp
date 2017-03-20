<%-- 
    Document   : alterar
    Created on : 20/03/2017, 09:05:55
    Author     : DesenvolvedorJava
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar Clube</title>
    </head>
    <body>
        <h1>Alterar Clube</h1>
        <hr/>
        <form action="AlterarClube" method="POST">
            
            Id: <input type="text" name="id"  readonly="true" value="${param.idalt}"/></br>
            Nome: <input type="text" name="nome" value="${param.nomealt}" /></br>
            <input type="submit" value="Confirmar Alteracao"/>
                 
        </form>
    </body>
</html>
