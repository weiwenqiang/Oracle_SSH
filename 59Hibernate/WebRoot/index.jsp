<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>影院信息查询</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type='text/javascript'
			src="/Cinema/dwr/interface/TypeBiz.js"></script>
	<script type='text/javascript' src="/Cinema/dwr/engine.js"></script>
	<script type='text/javascript' src="/Cinema/dwr/util.js"></script>
	<script type="text/javascript">
		function getType(){
			TypeBiz.getAllType(setType);		
		}		
		function setType(list){
			DWRUtil.removeAllOptions("typeid");
			//for(var property in list){
			//	alert("typeId:"+list[property].typeId+" typeNmae:"+list[property].typeName);
			//}
			DWRUtil.addOptions("typeid",list,"typeId","typeName");
		}
	</script>
  </head>
  
  <body>
    <form action="filmsearch.action" method="post">
     <table>
    	<tr><td>电影名称：</td><td><input name="filmname" type="text"/></td></tr>
    	<tr><td>电影类型：</td><td><select id="typeid" name="typeid" onfocus="getType()"><option value="%">全部</option></select> </td></tr>
    	<tr><td>主演：</td><td><input name="actor" type="text"/></td></tr>
     	<tr><td>导演：</td><td><input name="director" type="text"/></td></tr>
        <tr><td>价格：</td><td><input name="smallprice" type="text"/>至<input name="bigprice" type="text"/></td></tr>
    	<tr><td>查询 </td> <td><input name="submit" type="submit"/></td></tr>
     </table>
    </form>
  </body>
</html>
