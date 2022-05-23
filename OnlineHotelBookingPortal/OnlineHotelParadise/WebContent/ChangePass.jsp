<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<style>
label
{
color:red;
}
</style>

<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/jquery.validate.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("form").validate({
		rules:{
			oldpass : {
				required : true,
				maxlength : 15
			},
			newpass : {
				required : true,
				minlength:8,
				maxlength : 15
			},
			cppass : {
				required : true,
				maxlength : 15,
				equalTo : "#npPass"
			}
			}
	});
});
</script>
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
<div id="wrapper">																																																																																																																																												<div class="inner_copy"><a href="http://www.websitebuilderbox.com/best-website-builder-for-small-business/">http://www.websitebuilderbox.com/best-website-builder-for-small-business/</a></div>																																																																															
		<jsp:include page="Sidebar.jsp"></jsp:include><br><br>
<br><br>
<h2 align="center"><ins>Change Password</ins></h2>
<form action="LoginServlet" method="post">
<input type="hidden" name="operation" value="ChangePass">
<table>
<tr>
<td><label>Type</label></td>
<td><input type="radio" name="type" value="admin">Admin
    <input type="radio" name="type" value="user">User</td>
    </tr>

<tr>
<td><label>Old Password:</label></td>
<td><input type="password" name="oldpass"></td></tr>

<tr>
<td><label>New Password:</label></td>
<td><input type="password" name="newpass" id="npPass"></td></tr>

<tr>
<td><label>Confirm Password:</label></td>
<td><input type="password" name="cppass"></td></tr>

<tr>
<td><input type="submit" value="Login"></td>
<td><input type="reset"  value="Clear"></td></tr>
 </table>
</form></div>
</body>
</html>