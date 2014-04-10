<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All DVDs</title>
    </head>
    <body>
        <c:forEach var="dvd" items="${dvds}">
            <h1>${dvd.title}</h1>
            <ul>
               <li>Year: ${dvd.year}</li>
               <li>Duration: ${dvd.duration}</li>
               <li>Director: ${dvd.director.name}</li>
            </ul>
            <hr>
        </c:forEach>
    </body>
</html>
