<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.db.QuestionBank"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ADD QUESTIONS</title>
</head>
<body>
	<h1>welcome admin,please add question below</h1>
	<form action="a" method="post">
		<label>question id</label> <input type="text" name="qid"> <br>
		<label>question </label>
		<textarea rows="2" cols="20" name="q"></textarea>
		<br> <br> <label>option A</label> <input type="text"
			name="opA"> <br> <br> <label>option B</label> <input
			type="text" name="opB"> <br> <br> <label>answer</label>
		<input type="text" name="ans"> <br> <br> <input
			type="submit" value="ADD QUESTIONS"> <br>
		<br> <input type="submit" value="completed">
		<%
		String qid = request.getParameter("qid");
		String q = request.getParameter("q");
		String opA = request.getParameter("opA");
		String opB = request.getParameter("opB");
		String ans = request.getParameter("ans");

		QuestionBank.addQuestion1(qid, q, opA, opB, ans);
		%>
	</form>
</body>
</html>