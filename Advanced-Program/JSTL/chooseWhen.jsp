<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="num" value="10"></c:set>
<p>Number is:<c:out value="${num}"></c:out><br>
<c:choose>
<c:when test="${num%2==0}">
<c:out value="Even Number"></c:out>
</c:when>
<c:otherwise>
<c:out value="Number is Odd"></c:out>
</c:otherwise>
</c:choose>
</body>
</html>