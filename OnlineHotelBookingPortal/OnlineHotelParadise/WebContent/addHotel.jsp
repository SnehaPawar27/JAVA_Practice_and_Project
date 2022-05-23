<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Hotel Booking</title>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/jquery.validate.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$("form").validate({
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
					
				},
				hotellocation : {
					required : true,
					//lettersonly : true
				},
				hotelimage : {
					required : true
				},
				hoteldescription : {
					required : true,
					minlength : 5,
					maxlength : 100
				}
			} 
		});
	});
</script>
<style>
label{
	color: red;
}
fieldset
{
margin-left: 350px;
margin-right: 350px;
}
</style>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div id="wrapper">																																																																																																																																												<div class="inner_copy"><a href="http://www.websitebuilderbox.com/best-website-builder-for-small-business/">http://www.websitebuilderbox.com/best-website-builder-for-small-business/</a></div>																																																																															
		<jsp:include page="Sidebar.jsp"></jsp:include><br><br>
<div align="center">
<h2>Welcome To Hotel Paradise</h2><br><br>
	<fieldset>
	<legend>Add Hotel Info:</legend>
	<form id="1" action="HotelServlet" method="post" enctype="multipart/form-data">
	<input type="hidden" name="operation" value="AddHotel">
		<table>
			<tr>
				<th>Hotel Name:</th>
				<td><input type="text" placeholder="insert hotel name"
					name="hotelname"></td>
				
			</tr>
			<tr>
				<th>Hotel Price:</th>
				<td><input type="text" name="hotelprice"></td>
			</tr>
			<tr>
				<th>Hotel Type:</th>
				<td><input type="text" name="hoteltype"></td>
			</tr>
			<tr>
				<th>Hotel Location:</th>
				<td><input type="text" name="hotellocation"></td>
			</tr>
			<tr>
				<th>Upload Hotel Image:</th>
				<td><input type="file" name="hotelimage"></td>
			</tr>
			<tr>
				<th>Hotel Description:</th>
				<td><textarea rows=5 cols=20 name="hoteldescription"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Hotel"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		</table>
	</form>
	</fieldset>
	</div></div>
	<jsp:include page="Footer.jsp"></jsp:include>
	</body>
</html>