<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>トップ</title>
</head>
<body>
	<s:form action="LoginAction">
		<s:textfield name="name" />
		<s:password name="password" />
		<s:submit value="SUBMIT" />
	</s:form>

</body>
</html>