<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="jq/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$("button").click(function(){
		$.post("reference.jsp",
				{
			name:"yuga",
     			},
     			function(data,status){
     				alert("Data: "+data+"\nStatus:"+status);
     			});
	});
});
</script>
</head>
<body>
<br><br>
<button>send an HTTP POST request to a page and get the result back.</button>
</body>
</html>