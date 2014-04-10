<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Add a Dvd</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <form action="dvds" method="post">
            Title: <input type="text" name="title"/></br>
            Year: <input type="text" name="year"/></br>
            Duration: <input type="text" name="duration"/></br>
            Director: <input type="text" name="director"/></br>
            <input type="submit"/>
        </form>
    </body>
</html>
