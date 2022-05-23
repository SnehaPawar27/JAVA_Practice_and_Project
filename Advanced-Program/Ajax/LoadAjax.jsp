<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ajax Load</title>
<script src="jq/jquery.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#btn1").click(function(){
		$("#div1").load("Test");
	});
});
</script>
</head>

<body>
<br><br>
<div id="div1"><b>This text will be changed after clicking button.</b></div>
<br><br>
<button id="btn1">Load Content</button>

</body>
</html>