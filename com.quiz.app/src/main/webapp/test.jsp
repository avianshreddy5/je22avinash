<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.db.QuestionBank"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
	<%!String qid = "";
	String q = "";
	String opA = "";
	String opB = "";

	int i = 1;%>
	<%
	while (i <= 6) {
		ArrayList al = QuestionBank.fetchQues(i);
		for (Object o : al) {
			//out.print(o + "<br>");
			String row = o.toString();
			String[] qa = row.split(":");
			qid = qa[0];
			q = qa[1];
			
			
			opA = qa[2];
			opB = qa[3];

		}

		i++;
		break;
	}
	%>
	<form action="test.jsp">
		<h1>
			Q.
			<%=qid%></h1>
		<h2>
			Question:<%=q%></h2>

		A.<input type="radio" name="a"><%=opA%><br> B.<input
			type="radio" name="a">
		<%=opB%>
		<input type="submit" value="NEXT">
	</form>
</body>
</html>