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
	<s:property value="name" /><br>
	<s:property value="#session.name"/>
	
	<s:property value="sample" />
	
	<%-- 
		<s:select name="category">
			<option>値を選択</option>
			<option value="kagu">家具</option>
			<option value="kagu">家電</option>
			<option value="kagu">セール</option>
		</s:select>
		<s:submit />
		--%>
</body>
</html>