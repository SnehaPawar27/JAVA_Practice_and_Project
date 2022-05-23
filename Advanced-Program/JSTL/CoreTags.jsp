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

<c:set var="mark" value="35"></c:set>
<c:if test="${mark>=40}">
<c:out value="result is pass!!"></c:out></c:if><br>
<c:if test="${mark<40}">
<c:out value="result is Fail"></c:out></c:if>
</body>
</html>