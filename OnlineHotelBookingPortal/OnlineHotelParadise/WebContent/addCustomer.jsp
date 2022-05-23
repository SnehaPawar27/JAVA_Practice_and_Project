<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Online Hotel Booking</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script type="text/javascript">
$(document).ready(
		function()
		{
			$("#1").validate(
			{
				rules:
				{
					customername:{required:true,lettersonly:true},
					customeraddress:{required:true},
					customercontactno:{required:true,number:true},
					customeremailid:{required:true},
					customerpassword:{required:true,minlength:5,maxlength:10}
				}
			});
		});
</script>

<style>
label.error {
	color: red;
}
</style>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div id="wrapper">																																																																																																																																												<div class="inner_copy"><a href="http://www.websitebuilderbox.com/best-website-builder-for-small-business/">http://www.websitebuilderbox.com/best-website-builder-for-small-business/</a></div>																																																																															
		<jsp:include page="Sidebar.jsp"></jsp:include><br><br>
<div align="center">
<h4 align="center">Welcome To Hotel Paradise</h4>
	<br><br>
		<form id="1">
			<table>
				<tr>
					<th>Customer Name:</th>
					<td><input type="text" name="customername"></td>
				</tr>
				<tr>
					<th>Customer Address:</th>
					<td><textarea rows=5 cols=20 name="customeraddress"></textarea></td>
				</tr>
				<tr>
					<th>Customer ContactNo:</th>
					<td><input type="text" name="customercontactno"></td>
				</tr>
				<tr>
					<th>Customer EmailId:</th>
					<td><input type="email" name="customeremailid"></td>
				</tr>
				<tr>
					<th>Customer Password:</th>
					<td><input type="password" name="customerpassword"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register"></td>
					<td><input type="reset" value="Cancel"></td>
				</tr>
			</table>
       </form>
       </div>
       </div>
       <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>