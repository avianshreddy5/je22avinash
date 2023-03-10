<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="com.pojos.Sum"%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: yellow;">
	<%
	int num1 = Integer.parseInt(request.getParameter("n1"));
	int num2 = Integer.parseInt(request.getParameter("n2"));
	int res = Sum.findsum(num1, num2);
	%>
	<h1>
		<%="Result=" + res%>
	</h1>
</body>
</html>