<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"+ request.getServerName() + ":" + request.getServerPort()+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'result.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table border="1" bordercolor="#66CCCC">
		<tr align="center">
			<td>电影名称</td>
			<td>类型</td>
			<td>主演</td>
			<td>导演</td>
			<td>票价</td>
		</tr>
		<c:choose>
			<c:when test="${empty requestScope.result}">
				<tr>
					<td colspan="5"><c:out value="未找到符合条件的电影" /></td>
				</tr>
			</c:when>
			<c:when test="${!empty requestScope.result}">
				<c:forEach items="${requestScope.result}" var="film">
					<tr>
						<td>${film.filmName}</td>
						<td>${film.typeId}</td>
						<td>${film.actor}</td>
						<td>${film.director}</td>
						<td>${film.ticketPrice}</td>
					</tr>
				</c:forEach>
			</c:when>

		</c:choose>
	</table>
</body>
</html>
