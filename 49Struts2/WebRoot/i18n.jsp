<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title><s:text name="login.title"></s:text></title>
    
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
  		<a href="i18n.action?l=en&c=US">yingwen</a><br>
  		<a href="i18n.action?l=zn&c=CN">zhongwen</a><br>
        <s:form action="i18n.action">
        <s:textfield name="username" key="login.username"></s:textfield>
        <s:password name="password" key="login.password"></s:password>
        <s:textfield name="age" label="AGE"></s:textfield>
        <s:submit value="submit" key="login.submit"></s:submit>
        </s:form>
  </body>
</html>
