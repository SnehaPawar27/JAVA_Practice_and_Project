<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:set var="amount" value="987.6510"></c:set>
<fmt:parseNumber var="amt" type="number" value="${amount}"></fmt:parseNumber>
<c:out value="${amt}"></c:out><br>

<fmt:parseNumber var="i" integerOnly="true" type="number" value="${amount}"></fmt:parseNumber>
<c:out value="${i}"></c:out>
</body> 
</html>