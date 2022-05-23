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
String str="Welcome to Coder!!!";

pageContext.setAttribute("value",str,pageContext.SESSION_SCOPE);
pageContext.setAttribute("value",str,pageContext.PAGE_SCOPE);
pageContext.setAttribute("value",str,pageContext.REQUEST_SCOPE);
pageContext.setAttribute("value",str,pageContext.APPLICATION_SCOPE);

String strSession=(String)pageContext.getAttribute("value",pageContext.SESSION_SCOPE);
String strPage=(String)pageContext.getAttribute("value",pageContext.PAGE_SCOPE);
String strRequest=(String)pageContext.getAttribute("value",pageContext.REQUEST_SCOPE);
String strApp=(String)pageContext.getAttribute("value",pageContext.APPLICATION_SCOPE);
%>

<b> Session Scope: &nbsp; <%=strSession%></b><br>
<b> Page Scope: &nbsp; <%=strPage%></b><br>
<b> Request Scope: &nbsp; <%=strRequest%></b><br>
<b> Application Scope: &nbsp; <%=strApp%></b><br>

<% pageContext.forward("pageContext2.jsp"); %>
<a href="pageContext2.jsp">Click for next Page</a>
</body>
</html>







