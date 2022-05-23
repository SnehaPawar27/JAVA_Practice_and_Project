<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.HotelParadise.Pojo.Hotel"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Hotel Booking</title>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script>
	$(document).ready(function() {
		$("#1").validate({
			rules : {
				hotelname : {
					required : true
				},
				hotelprice : {
					required : true,
					number : true
				},
				hoteltype : {
					required : true,
					lettersonly : true
				},
				hotellocation : {
					required : true,
					lettersonly : true
				},
				hotelimage : {
					required : true
				},
				hoteldescription : {
					required : true,
					minlength : 5,
					maxlength : 100
				}
			},
		});
	});
</script>
<style>
label{
	color: red;
}
</style>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div id="wrapper">																																																																																																																																												<div class="inner_copy"><a href="http://www.websitebuilderbox.com/best-website-builder-for-small-business/">http://www.websitebuilderbox.com/best-website-builder-for-small-business/</a></div>																																																																															
		<jsp:include page="Sidebar.jsp"></jsp:include><br><br>
<%
Hotel h=(Hotel)session.getAttribute("hotelObj");
%>
<div align="center">
<h4 align="center">Welcome To Hotel Paradise</h4>
	<br><br>
	<form id="1" action="HotelServlet" method="post">
	<input type="hidden" name="operation" value="updateHotel">
	
		<table>
			<tr>
			<th>Hotel Id:</th>
			<td><input type="text" name="hotelid" value="<%=h.getHotelId()%>" readonly></td>
			</tr>
			
			<tr>
			<th>Hotel Name:</th>
			<td><input type="text" placeholder="insert hotel name"
					name="hotelname" value="<%=h.getHotelName()%>"></td>
			</tr>
			<tr>
				<th>Hotel Price:</th>
				<td><input type="text" name="hotelprice" value="<%=h.getHotelPrice() %>"></td>
			</tr>
			<tr>
				<th>Hotel Type:</th>
				<td><input type="text" name="hoteltype" value="<%=h.getHotelType()%>"></td>
			</tr>
			<tr>
				<th>Hotel Location:</th>
				<td><input type="text" name="hotellocation" value="<%=h.getHotelLocation()%>"></td>
			</tr>
			<tr>
				<th>Upload Hotel Image:</th>
				<td><input type="text" name="hotelimage" value="<%=h.getImage() %>"></td>
			</tr>
			<tr>
				<th>Hotel Description:</th>
				<td><textarea rows=5 cols=20 name="hoteldescription"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Hotel"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		</table>
	</form>
	</div></div>
	<jsp:include page="Footer.jsp"></jsp:include>
	</body>
</html>