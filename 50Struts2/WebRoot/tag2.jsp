<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.wwq.tag.Student" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>Struts2标签</title>
    
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
    <s:form>
		<s:textfield name="username" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:submit value="提交"></s:submit>
		<s:radio list="#{'1':'男','2':'女','3':'未知'}" listKey="key"
			listValue="value" name="sex" label="性别">
		</s:radio>
开发中list引用一个变量map等…
<s:checkboxlist list="#{'1':'豪车','2':'美女','3':'金条'}" listKey="key"
			listValue="value" name="sex" label="性别">
		</s:checkboxlist>


	</s:form>

	<s:combobox list="#{'1':'豪车','2':'美女','3':'金条'}" listKey="key"
		listValue="value" name="hobby" label="爱好">
	</s:combobox>
	<s:optiontransferselect doubleList="" list="{'豪车','美女','金条'}"
		doubleName="" name="selecttype">
	</s:optiontransferselect>
  </body>
</html>
