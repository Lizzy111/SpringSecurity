<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>HOME</title>
</head>
<body>

<c:if test="${not empty error}">
    ${error}
</c:if>

<form name="formLogin" action="/login" method="POST">
    <table>
        <tr>
            <td>USER</td>
            <td><input type="text" name="userLogin" value=""></td>
        </tr>

        <tr>
            <td>PASSWORD</td>
            <td><input type="password" name="passwordLogin"></td>
        </tr>
        <tr>
            <td> <input type="submit" name="Submit" value="submit"></td>
        </tr>
    </table>
</form>
</body>
</html>
