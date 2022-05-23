<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hotel Paradise_21732</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<link rel="stylesheet" href="css/responsiveslides.css" />
<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.min.js"></script>	
<script>
			    $(document).ready(
			    		function()
			    		{
			    			$("#1").validate(
			    			{
			    				rules:
			    				{
			    			emailid:{required:true},
			    			password:{required:true}
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
		<h2>Welcome To Hotel Paradise</h2>
		<br>
		<br>
		<h3>
			<ins>Add Hotel Info:</ins><br><br>
		</h3>
		<form id="1" action="LoginServlet" method="post">
		<input type="hidden" name="operation" value="Login">
			<table border=2>
				<tr>
					<td><input type="radio" name="type" value="Admin">Admin</td>
					<td><input type="radio" name="type" value="Customer">Customer</td>
				</tr>
				<tr>
					<th>Email Id:</th>
					<td><input type="email" name="emailid"></td>
				</tr>
				<tr>
					<th>Password:</th>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
					<td><input type="reset" value="Cancel"></td>
				</tr>
			</table>
			
		</form>
	</div>
</div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>