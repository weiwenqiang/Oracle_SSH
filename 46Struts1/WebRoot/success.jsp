<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'success.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>
<script type="text/javascript">
function invoke(method){
var form= document.forms[0];
form.action="<%=path%>/login.action?action=" + method;
		alert(form.action);
		form.submit();
	}
</script>
<body>
	success
	<br>

	<form name="f1" id="f1" action="#" method="post">
		<input type="button" value="add" onclick="invoke('add')"> <input
			type="button" value="del" onclick="invoke('del')"> <input
			type="button" value="update" onclick="invoke('update')"> <input
			type="button" value="sel" onclick="invoke('select')">
	</form>
</body>
</html>
