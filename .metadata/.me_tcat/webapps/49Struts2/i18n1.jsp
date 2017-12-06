<%@page import="java.util.Locale"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 在jsp中设置，date和salary，并获取 -->
	<%
		Date date = new Date();
		request.setAttribute("date", date);
		double salary = 321321.323;
		request.setAttribute("salary", salary);
	%>
	<br>
	<br> date:<%=date%><br> salary:<%=salary%>

	<br>
	<br>

	<!-- 利用jstl标签库，获取开头为test的.properties文件里的能容 ，
    其默认为中文的，即test_zh_CN.properties文件的值
    message为//MessageFormet:可以格式化模块字符串，formatDate和formetNumber...
    -->

	<fmt:bundle basename="test">
		<fmt:message key="date"></fmt:message>
		<fmt:formatDate value="${date }" />
		<fmt:message key="salary"></fmt:message>
		<fmt:formatNumber value="${salary }"></fmt:formatNumber>
	</fmt:bundle>
	<br>
	<br>

	<!-- 动态获取，显示中英文切换 -->

	<%
		String code = request.getParameter("code");
		if (code != null) {
			if ("en".equals(code)) {
				session.setAttribute("locale", Locale.US);
			} else if ("zh".equals(code)) {
				session.setAttribute("locale", Locale.CHINA);
			}
		}
	%>

	<!-- 在session范围内设置locale,便于在jsp中获取locale -->
	<c:if test="${sessionScope.locale!=null }">
		<fmt:setLocale value="${sessionScope.locale }" />
	</c:if>

	<fmt:setBundle basename="test" />

	<fmt:message key="date"></fmt:message>
	<fmt:formatDate value="${date }" />
	<fmt:message key="salary"></fmt:message>
	<fmt:formatNumber value="${salary }"></fmt:formatNumber>

	<br>
	<br>

	<a href="i18n1.jsp?code=en">英文显示</a>
	<br>
	<br>

	<a href="i18n1.jsp?code=zh">中文显示</a>
	<br>
	<br>
</body>
</html>
