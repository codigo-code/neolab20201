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
				if(request.getAttribute("persona") != null){
					out.println("<h1 style='color:red'>" + request.getAttribute("persona")+"</h1>");
				}else{
					out.println("no se cargo el objeto debe pasar antes por formulario.jsp");
					
				}
		%>
</body>
</html>