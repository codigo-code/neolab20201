<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		out.println("hola desde un jsp");
		
	%>

	<!--  SI LE PONEMOS LA BARRITA PERDEMOS EL CONTEXTO Y SE NOS VA  DISNEY! -->
	<form action="persona" method="get">
		<input type="text" name="nombre" placeholder="escriba su nombre" /> <br />
		<input type="submit" value="enviar" />
	</form>
	
	
</body>
</html>