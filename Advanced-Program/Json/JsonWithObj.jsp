<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Json With Object</title>
<script src="jq/jquery.min.js"></script>
<script type="text/javascript">
$(function()
		{
	$("button").click(
			function(){
				$.get("StudentServlet",function(data,status){
					$("tbody").html("");
					$.each(data,function(index,obj){
						
				if(obj!=null){
					$("table").css("display","block"); //display table
					$("tbody").append(
							"<tr><td>"+obj.studId+"</td><td>"+
							obj.studName+"</td></tr>");
				}
			});
		});
			});
		});
</script>
</head>
<body>
<button>Show data</button>
<table border="1" style="width:100px; text-align:center">
	<tfoot>
		<tr>
			<td colspan="6">Footer row</td>
		</tr>
	</tfoot>
	<tbody></tbody>
	<thead>
		<tr>
		<td>Id</td>
		<td>Name</td>
		</tr>
	</thead>
</table>
</body>
</html>