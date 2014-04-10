<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success</title>
    </head>
    <body>
        You add a DVD.
        <ul>
            <li>Title: ${it.dvd.title}</li>
            <li>Year: ${it.dvd.year}</li>
            <li>Duration: ${it.dvd.duration}</li>
            <li>Director: ${it.dvd.director.name}</li>
        </ul>
    </body>
</html>
