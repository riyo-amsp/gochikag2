<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:iterator value="itemList">
		<s:iterator>
			<p><s:property value="itemName" /></p>
			<p><s:property value="price" /></p>
			<img src="<s:property value="mainPicture"/>" >
		</s:iterator>
	</s:iterator>
</body>
</html>