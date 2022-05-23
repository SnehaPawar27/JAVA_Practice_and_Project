<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css" />
<!-- <link rel="stylesheet" href="css/responsiveslides.css" /> -->
</head>
<body>
<%
String cname=(String)session.getAttribute("username");
String admin=(String)session.getAttribute("admin");
%>
<div id="header">																																																																									
		<div class="login">
			<!-- <input type="text" class="input" value="Login" /> <input type="text" class="input" value="Password" />																																			
			<div class="enter"><a href="#">Enter</a> </div>-->
			<div class="links">
			<% if(cname==null && admin==null) 
			{%>
			<a href="Login.jsp">Login</a> <%} %>
			 <a href="addCustomer.jsp">Registration</a>
			 </div>
		</div>
		<ul id="menu">
			<li><a href="Home.jsp">Home page</a></li>                                                                                                                                                                                                                                                                                                                                                  
			<li><a href="HotelServlet?operation=showHotels">Hotels</a></li>
			<li><a href="Search.jsp">Search</a></li>
			
			<%if(admin!=null && cname==null) {%>
			<li><a href="addHotel.jsp">Add Hotels</a></li>
			<!-- <li><a href="CustomerServlet">Show Customers</a></li> -->
			<li><a href="ChangePass.jsp">Change Password</a>
			<li><a href="BookingServlet?operation=showBills">Show Bill</a></li>
			<li><a href="CustomerServlet?operation=showFeedback">Add Hotels</a></li>
			<%}%>
			
			<% if(admin==null && cname!=null) {%>
			<!-- <li><a href="Feedback.jsp">Give Feedback</a></li> -->
			<li><a href="BookingServlet">Show Booking</a></li>
			<li><a href="CustomerServlet?operation=edit">Update Profile</a></li>
			<%} %>
			
			<% if(admin!=null || cname!=null) {%>
			<li><a href="LoginServlet">Log Out</a>
			<%} %>
			</ul>
	</div>
</body>
</html>