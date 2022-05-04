<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actividades</title>
    </head>
    <body>
        <h1>Actividades</h1>
        <table cellpadding="2" cellspacing="4">
            <tr>
                <th>Descripci&oacute;n</th>
                <th>Categor&iacute;a</th>
                <th>Fecha entrega</th>
                <th>Avance</th>
            </tr>
        <c:set var="cats" value="${actionBean.mapaCategorias}"/>
        <c:forEach var="act" items="${actionBean.actividades}">
            <tr>
                <td>${act.descripcion}</td>
                <td>${cats[act.idCategoria].nombre}</td>
                <td><fmt:formatDate value="${act.plazoEntrega}" pattern="dd-MMM-yyyy"/></td>
                <td align="right"><fmt:formatNumber value="${act.avance}" type="percent"/></td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
