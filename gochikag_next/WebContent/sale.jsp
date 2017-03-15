<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>セール</title>
</head>
<body>
	<s:iterator value="items">
		<s:iterator>
			<p><s:property value="itemName" /></p>
			<p><s:property value="price" /></p>
			<s:form action="ItemAction">
				<s:hidden name="itemId" value="%{itemId}" />
				<s:submit type="image" src="learn.jpg"/>
			</s:form>
		</s:iterator>
	</s:iterator>
</body>
</html>