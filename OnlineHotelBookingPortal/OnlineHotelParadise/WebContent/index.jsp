<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Paradise</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="style.css" />
</head>

<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<div id="wrapper">																																																																																																																																												<div class="inner_copy"><a href="http://www.websitebuilderbox.com/best-website-builder-for-small-business/">http://www.websitebuilderbox.com/best-website-builder-for-small-business/</a></div>																																																																															
		<jsp:include page="Sidebar.jsp"></jsp:include>
		<div id="content">
			<div class="search"><span>Search</span> <input type="text" /></div>
			
			<% String bill=(String)request.getAttribute("billDetail");
		  			if(bill!=null)
			  		out.println(bill);
					%><div class="bg">
				<div class="column1">
				
					<img src="images/title2.gif" alt="" width="258" height="21" /><br />
					<p>Hotel Paradise is an Indian online travel company founded in 2019.<br>
					The company provides online travel services where you can book Hotels.<br>
					The Hotel List contains Hotels from top cities in India.<br></p>
					<img src="images/title3.gif" alt="" width="258" height="21" /><br />
					<div id="items">
						<div class="item">
							<a href="#"><img src="images/pic1.jpg" alt="" /></a>
							<span><a href="#">Australia</a></span>
						</div>
						<div class="item">
							<a href="#"><img src="images/pic2.jpg" alt="" /></a>
							<span><a href="#">Miami</a></span>
						</div>
						<div class="item">
							<a href="#"><img src="images/pic3.jpg" alt="" /></a>
							<span><a href="#">Canada</a></span>
						</div>
						<div class="item">
							<a href="#"><img src="images/pic3.jpg" alt="" /></a>
							<span><a href="#">Maldives</a></span>
						</div>
					</div>
				</div>
				<div class="column2">
					<img src="images/title4.gif" alt="" width="133" height="18" /><br />
					<div class="news">
						<span>24 may 0000</span><br />
						<p>Lorem ipsum dolor sit amet, sectetu adip scing varius interdum incid unt quis, libero. Aenean mturpis. Maecenas hendrerit masa laoreet iaculipede mnisl ulamcorper. Tellus er sodales enim, in tincidunt mauris in odio. Massa ac laoreet iaculipede nisl.</p>
						<a href="#" class="more">more info</a>
					</div>
					<div class="news">
						<span>12 may 0000</span><br />
						<img src="images/pic5.jpg" alt="" width="183" height="97" />
						<p>Proin nunc. Donec massa. Nulla pulvinar, nisl ac convallis nonummy, tellus eros sodales enim, in tincidunt mauris in odio.  massa ac laoreet iaculipede nisl ullamcorpermassa,consectetuer </p>
						<a href="#" class="more">more info</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
