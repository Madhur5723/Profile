<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO REGISTER PAGE</h1>
<form>
Username:<input type="text" name="uname"><br><br>
<input type="submit" values ="send"><br><br>
</form>
<h1>POSTMETHOD</h1>
<form action ="finduser" method="post">
Username:<input type="text" name="uname"><br><br>
<input type="submit" values ="send"><br><br>
</form>


</body>
</html>