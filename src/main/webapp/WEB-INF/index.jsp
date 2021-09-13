<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Pagina1:</title>
</head>
<body>
	<div>
		<h1>formulario </h1>
		<form action="/formulario" method="post">
			<label for="nombre">nombre:</label>
			<input type="text" name="nombre">
			<label for=apellido>apellido:</label>
			<input type="text" name="apellido">
			<label for="limite">limite:</label>
			<input type="text" name="limite">
			<label for="codigopostal">codigopostal:</label>
			<input type="text" name="codigopostal">
			<input type="submit" value="enviar">
			
		</form>
	</div>
</body>
</html>