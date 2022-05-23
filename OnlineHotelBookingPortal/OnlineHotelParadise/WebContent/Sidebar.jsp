<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.*,com.HotelParadise.Pojo.Hotel" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
<%List<Hotel> hList=(List<Hotel>)session.getAttribute("typeList"); %>
<div id="sidebar">
			<div class="logo_block">
				<a href="#"><img src="images/logo.jpg" alt="setalpm" width="198" height="156" /></a><br />
				<span class="slogan">Best offers for You</span>
				<p class="text1">We offer the best deals on luxury hotels. Hurry Up!</p>
			</div>
			<img src="images/title1.gif" alt="" width="126" height="21" /><br />
			<ul id="navigation">
			<%for(Hotel h:hList ) { %>
			<li class="color"><a href="HotelServlet?operation=getHotelByType&type=<%=h.getHotelType()%>"><%=h.getHotelType()%></a>	
			<%} %>
			</ul>
		</div>
</body>
</html>








