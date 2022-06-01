<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="arithmeticCalc">
            <label>Enter first number </label>
            <input type="text" name="firstNumber" value="">
            <br>
            <label>Enter second number </label>
            <input type="text" name="secondNumber" value="">
            <br>
            <br><br>
            <input type="submit" name="btn" value="+">
            <input type="submit" name="btn" value="-">
            <input type="submit" name="btn" value="*">
            <input type="submit" name="btn" value="%">
        </form>
        <p>${message}</p>
    <a href="age">Age Calculator</a>
    </body>
</html>
