<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*,com.HotelParadise.Pojo.HotelBooking" %>    
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
<form action="BookingServlet" method="post">
<table border="1">
<%
			List<HotelBooking> hbList = (List<HotelBooking>) session.getAttribute("bookingList");
		%>
<tr>
			<th>Booking Id</th>
			<th>Hotel Name</th>
			<th>No of Rooms</th>
			<th>No of Days</th>
			<th>Hotel Price</th>
			
			<%
			for(HotelBooking hb:hbList)
				{
		%>
		<tr>
		    <td><%=hb.getBookingId() %>
			<td><%=hb.getHotelName()%></td>
			<td><input type="number" name="noofrooms" value=<%=hb.getNoOfRooms() %>></td>
			<td><input type="number" name="noofdays" value=<%=hb.getNoOfDays() %>></td>
			<td><input type="text" name="hotelprice" value=<%=hb.getHotelPrice() %> readonly>
			<td><a href="BookingServlet?operation=deleteBooking&bookingId=<%=hb.getBookingId()%>" style="color: red">Cancel</a></td>
			<% } %>
</tr>
</table><br><br>
<div align="center"><input type="submit" value="Confirm Booking"></div>
</form>
</div>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>