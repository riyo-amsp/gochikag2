<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ログイン</title>
</head>
<body>
	<s:include value="header.jsp" />

	<s:form action="LoginAction">
		<s:textfield name="name" />
		<s:password name="password" />
		<s:submit value="送信"/>
	</s:form>



<!-- 後でOAUTH機能追加します -->
<!-- TWITTERだよ -->
	<a href="<s:url action="TwitterAction"/>">
    	<img src="twitter-j.png"/>
    </a>
</body>
</html>