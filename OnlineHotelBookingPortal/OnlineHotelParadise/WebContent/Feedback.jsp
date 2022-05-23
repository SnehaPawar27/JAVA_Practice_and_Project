<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="style.css" />
<title>Insert title here</title>
<script src="js/jquery.min.js"></script>
<script src="js/jquery.validate.min.js"></script>
<script src="js/additional-methods.js"></script>
<script>
		    $(document).ready(
			    		function()
			    		{
			    			$("#1").validate(
			    			{
			    				rules:
			    				{
			    					name:{required:true,lettersonly:true},
			    					emailid:{required:true},
			    					contactno:{required:true,number:true},
			    					comment:{required:true}
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
		<h2>Welcome To Hotel Paradise</h2><br><br>
		<h3><ins>Feedback Form:</ins></h3>
<form id="1" >

Give us your Feedback here your feedback is very valuable for us:<br>
<table border="">
<tr>
<th>Name:</th>
<td><input type="text" name="name"></td>
</tr>
<tr>
<th>EmailId:</th>
<td><input type="email" name="emailid"></td>
</tr>
<tr>
<th>Contact No:</th>
<td><input type="text" name="contactno"></td>
</tr>
<tr>
<th>Comment:</th>
<td><textarea rows="10" cols="20" name="comment"></textarea></td>
</tr>
<tr>
<td><input type="submit" value="Done"></td>
<td><input type="reset" value="Clear"></td>
</tr>
</table>
</form>
</div></div>
<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>