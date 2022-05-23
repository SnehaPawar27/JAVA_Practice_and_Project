<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.HotelParadise.Pojo.Hotel" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div id="wrapper">																																																																																																																																												<div class="inner_copy"><a href="http://www.websitebuilderbox.com/best-website-builder-for-small-business/">http://www.websitebuilderbox.com/best-website-builder-for-small-business/</a></div>																																																																															
		<jsp:include page="Sidebar.jsp"></jsp:include><br><br>
<%-- <%
List<Hotel> hlist=(List<Hotel>)session.getAttribute("hList");
%> --%>
<%-- <%
String cname=(String)session.getAttribute("username");
String admin=(String)session.getAttribute("admin");
%> --%>
<div align="center">
<br><br>
<h2>Hotel List:</h2>
<br><br>
<table border="1">
<tr><th>Hotel Id</th>
<th>Hotel Name</th>
<th>Hotel Type</th>
<th>Location</th>
<th>Price</th>
<th>Image</th>
<th>Description</th>
<c:if test="${username!=null || admin!=null}">
<th>Action</th></c:if>
</tr>

<%-- <%
for(Hotel h:hlist)
{ %>
	<tr>
	<td><%=h.getHotelId() %></td>
	<td><%=h.getHotelName() %></td>
	<td><%=h.getHotelType() %></td>
	<td><%=h.getHotelLocation() %></td>
	<td><%=h.getHotelPrice() %></td>
	<td><img src="DispImgServlet?id=<%=h.h.getHotelId()%" width="100px" height="100px"></td>
	<td><%=h.getHotelDescription() %></td>
	<td>
	<% if(cname==null && admin!=null){ %>
	<a href="HotelServlet?operation=delete&hotelId=<%=h.getHotelId() %>">Delete|</a>
	<a href="HotelServlet?operation=edit&hotelId=<%=h.getHotelId() %>">Edit</a>
	<%} %>
	<%if(cname!=null && admin==null){ %>
	<a href="BookingServlet?operation=addToCart&hotelId=<%=h.getHotelId() %>">Add Booking</a>
	<%} %>
	</td></tr>
<%
}
%> --%>


<c:forEach var="h" items="${hList}"> 
<tr>
<td>${h.hotelId}</td>
<td>${h.hotelName}</td>
<td>${h.hotelType}</td>
<td>${h.hotelLocation}</td>
<td>${h.hotelPrice}</td>
<td><img src="DispImgServlet?id=${h.hotelId}" height="100px" width="100px" alt="image"></img></td>
<td>${h.hotelDescription}</td>
<td>
<c:if test="${username==null && admin!=null}">
<a href="HotelServlet?operation=delete&hotelId=${h.hotelId}">Delete|</a>
	<a href="HotelServlet?operation=edit&hotelId=${h.hotelId}">Edit</a>
</c:if>
<c:if test="${username!=null && admin==null}">
<a href="BookingServlet?operation=addToCart&hotelId=${h.hotelId}">Add Booking</a>
</c:if>
</c:forEach>
</table></div></div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>