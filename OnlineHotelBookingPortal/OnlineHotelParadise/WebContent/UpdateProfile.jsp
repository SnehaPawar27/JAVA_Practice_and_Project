<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.HotelParadise.Pojo.Customer" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css" />
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
<%
Customer cust=(Customer)session.getAttribute("custObj");
%>
<div align="center">
<h4 align="center">Welcome To Hotel Paradise</h4>
	<br><br>
		<form id="1" action="CustomerServlet" method="post">
		<input type="hidden" name="operation" value="updateCust">
			<table>
			<tr>
					<th>Customer Id:</th>
					<td><input type="text" name="customerId" value="<%=cust.getCustId()%>"></td>
				</tr>
				<tr>
					<th>Customer Name:</th>
					<td><input type="text" name="customername" value="<%=cust.getCustName()%>"></td>
				</tr>
				<tr>
					<th>Customer Address:</th>
					<td><input type="text" name="customeraddress" value="<%=cust.getAddress()%>"></td>
				</tr>
				<tr>
					<th>Customer ContactNo:</th>
					<td><input type="text" name="customercontactno" value="<%=cust.getContactNo()%>"></td>
				</tr>
				<tr>
					<th>Customer EmailId:</th>
					<td><input type="email" name="customeremailid" value="<%=cust.getCustEmail()%>"></td>
				</tr>
				<tr>
					<th>Customer Password:</th>
					<td><input type="password" name="customerpassword" value="<%=cust.getCustPass()%>"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Update Profile"></td>
					<td><input type="reset" value="Cancel"></td>
				</tr>
			</table>
       </form>
       </div>
       </div>
       <jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>