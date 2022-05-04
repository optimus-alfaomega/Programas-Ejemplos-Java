<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva actividad</title>
    </head>
    <body>
        <h1>Crear Actividad</h1>
        <form action="Actividad.action" method="POST">
            <table>
                <tr><td><label for="desc">Descripci&oacute;n:</label></td>
                    <td><input id="desc" name="actividad.descripcion" type="text" maxlength="80" size="60"></td>
                </tr>
                <tr><td><label for="fecha">Fecha de entrega:</label></td>
                    <td><input id="fecha" name="actividad.plazoEntrega" type="text" size="20"/> (dd/mm/aaaa)</td>
                </tr>
                <tr><td><label for="cat">Categor&iacute;a</label></td>
                    <td><select name="actividad.idCategoria">
                            <c:forEach var="entry" items="${actionBean.mapaCategorias}">
                                <option id="${entry.key}">${entry.value.nombre}</option>
                            </c:forEach>
                        </select></td>
                </tr>
                <tr><td></td>
                    <td><input type="submit" name="crearActividad" value="Crear"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
