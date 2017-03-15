<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>login</title>
</head>
<body>

	<s:form action="LoginAction">
		<s:textfield name="phoneEmail" />
		<s:password name="password" />
		<s:submit type="image" src="learn.jpg" />
	</s:form>

</body>
</html>