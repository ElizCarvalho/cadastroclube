<%-- 
    Document   : consulta
    Created on : 13/03/2017, 08:40:47
    Author     : DesenvolvedorJava
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    
        <table border="0">
            <thead>
                <th>Id</th>
                <th>Nome</th>
            </thead>
            <tbody>
                <c:forEach var="clube" items="${listaClubes}">
                    <tr>
                        <td><c:out value="${clube.idclube}" /></td>
                        <td><c:out value="${clube.nome}" /></td>
                        <td>
                            <form action="ExcluirClube" method="POST">
                                <input type="hidden" name="idExcluir" value="${clube.idclube}"/>
                                <input type="submit" value="Excluir"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    
        
    </body>
</html>
