<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>家具</title>
</head>
<body>
	<s:iterator value="items">
		<s:iterator>
			<p><s:property value="price" /></p>
			<s:form action="ItemAction">
				<s:hidden name="itemName" value="%{itemName}" />
				<s:submit type="image" src="%{url}"/>
			</s:form>
		</s:iterator>
	</s:iterator>	
</body>
</html>