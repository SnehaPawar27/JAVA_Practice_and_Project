<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%! int a=10;%> 
<% out.println(a);%>

<% String c=(String)session.getAttribute("course");
out.println(c);
%>

</body>
</html>