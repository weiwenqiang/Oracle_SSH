<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>发布电影信息</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
		function validate(){
			
		}
</script>
</head>

<body>
	<form action="filmadd.action" method="post"
		onsubmit="return validate()">
		<table>
			<tr>
				<td>电影名称：</td>
				<td><input name="filmname" type="text" /></td>
				<td><div id="fnmessage" style="display:none"></div></td>
			</tr>
			<tr>
				<td>电影类型：</td>
				<td><select style="width:80px" id="typeid" name="typeid">
				</select></td>
				<td><div id="timessage" style="display:none"></div></td>
			</tr>
			<tr>
				<td>主演：</td>
				<td><input name="actor" type="text" />
				</td>
			</tr>
			<tr>
				<td>导演：</td>
				<td><input name="director" type="text" />
				</td>
			</tr>
			<tr>
				<td>价格：</td>
				<td><input name="ticketprice" type="text" /></td>
				<td><div id="tpmessage" style="display:none"></div></td>
			</tr>
			<tr>
				<td>发布</td>
				<td><input name="submit" value="发布" type="submit" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
