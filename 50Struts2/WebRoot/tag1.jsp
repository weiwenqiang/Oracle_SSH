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
    <s:set name="age" value="18" scope="request"></s:set>
	<s:set name="salary" value="30000" scope="request"></s:set>
	<s:if test="#request.age<=18">
    young
    <s:if test="#request.salary<=3000">
    normal
    </s:if>
		<s:elseif test="#request.salary>3000&&#request.salary<100000">
    hen li hai
    </s:elseif>
		<s:else>
    earn
    </s:else>
	</s:if>
	<s:elseif test="#request.age>18&&#request.age<60">
    earn money
    </s:elseif>
	<s:else>
    over
    </s:else>
	<%
		Student s = new Student();
		s.setName("aaa");
		Student s1 = new Student();
		s1.setName("b");
		Student s3 = new Student();
		s3.setName("c");
		List list = new ArrayList();
		list.add(s);
		list.add(s1);
		list.add(s3);
		request.setAttribute("stulist", list);
	%>
	<s:iterator value="#request.stulist" status="st">
		<br>
		<s:property value="name" />
		<s:property value="#st.index" />
		<!-- 索引号 -->
		<s:property value="#st.count" />
		<!-- 计数 -->
		<s:property value="#st.first" />
		<!-- 是否第一行 -->
		<s:property value="#st.last" />
		<!-- 是否最后一行 -->
		<s:property value="#st.even" />
		<!-- 基数 -->
		<s:property value="#st.odd" />
		<!-- 偶数 -->

		<br>
	</s:iterator>

	<!-- 在s:append标签中模拟赋值 -->
	<s:append id="appendList">
		<s:param value="{'a','b','c'}"></s:param>
		<s:param value="{'d','e','f'}"></s:param>
	</s:append>

	---------------------------------------------------------------------------------------------------------
	<!--<s:property value="#appendList"/>-->
	---------------------------------------------------------------------------------------------------------------------------------------------------------------

	<!-- 循环迭代 只需要 s:property 标签即可 -->
	<s:iterator value="#appendList">
		<s:property />
		<br />
	</s:iterator>

	<hr>
	<s:generator separator="a" val="'abc,def,corejava'">
		<s:iterator>
			<s:property />
			<br>
		</s:iterator>
	</s:generator>
	<hr>
	<s:subset source="#request.stulist" start="0" count="2">
		<s:iterator>
			<s:property value="name" />
			<br>
		</s:iterator>
	</s:subset>

	<%
		List list1 = new ArrayList();
		Student p = new Student("zs", 1);
		Student p1 = new Student("ls", 3);
		Student p2 = new Student("ww", 2);
		list1.add(p);
		list1.add(p1);
		list1.add(p2);
		request.setAttribute("a", list1);
	%>
	<s:bean name="com.wwq.tag.MyComparator" id="c" />
	<s:sort comparator="c" source="#request.a">
		<s:iterator>
			<s:property value="name" />
			<s:property value="age" />
			<br>
		</s:iterator>
	</s:sort>


	<%
		Date d = new Date();
		out.print(d);
		request.setAttribute("date", d);
	%>
	<s:date name="#request.date" format="yyyy/MM-dd : hh:mm:ss" />
	<s:set name="age" value="11" scope="request"></s:set>
	<!-- 注意 value 的赋值中的单引号 -->
	<s:set name="name" value="'tom'" scope="session"></s:set>
	<s:debug></s:debug>
	<h3>第9个结果</h3>
	<!-- 表单 -->
	<s:form>
		<s:textfield name="username" label="用户名"></s:textfield>
		<s:password name="password" label="密码"></s:password>
		<s:submit value="提交"></s:submit>
		<!-- 单选按钮 -->
		<s:radio list="#{'1':'男','2':'女','3':'未知' }" listKey="key"
			listValue="value" name="sex" label="性别"></s:radio>
		<!--多选按钮-->
		<s:checkboxlist list="#{'1':'豪车','2':'美女','3':'金钱' }" listKey="key"
			listValue="value" name="hobby" label="爱好"></s:checkboxlist>
		<!--可以跳转的选择  -->
		<s:combobox list="#{'1':'豪车','2':'美女','3':'金条'}" listKey="key"
			listValue="value" name="hobby" label="爱好">
		</s:combobox>
		<s:optiontransferselect doubleList="" list="{'豪车','美女','金条'}"
			doubleName="" name="selecttype">
		</s:optiontransferselect>
	</s:form>
  </body>
</html>
