<%@ page language="java" import="java.util.*;" pageEncoding="gbk"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>��¼</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

</head>
<body>
	<form name="f1" id="f1" action="login.wwq" method="post">
		<table border="0">
			<tr>
				<td>Login:</td>
				<td><input type="text" name="user" id="login">
				</td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="age" id="password">
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
