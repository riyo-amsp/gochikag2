<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<s:property value="%{name}" /><br>
	<s:property value="password" /><br>
	
	<s:iterator value="list">
		<s:iterator>
			<s:property value="name" /><br>
			<s:property value="password" /><br>
			<s:property value="id" /><br>
		</s:iterator>
	</s:iterator>
	<a href="main2.jsp">main2.jsp</a><br>
	
	<s:property value="name"/><br>
	
	<s:iterator value="list">
		<s:form action="MainAction">
			<s:hidden name="sample" value="%{name}"/>
			<s:submit value="submit"/>
		</s:form>
	</s:iterator>
	
		<s:form action="MainAction">
			<s:hidden name="sample" value="%{name}"/>
			<s:submit value="submit"/>
		</s:form>
	
</body>
</html>