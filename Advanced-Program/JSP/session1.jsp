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
 session.setAttribute("course", "Profession java Specialist!!");
 %>
 <a href="session2.jsp">click to check in page1</a><br>
 <a href="Out.jsp">click to check in page2</a>
</body>
</html>