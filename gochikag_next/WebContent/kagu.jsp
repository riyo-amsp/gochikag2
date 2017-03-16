<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" type="text/css" href="css/kagu.css">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>家具</title>

	<!-- ファビコンです　米島 -->

<link rel="shortcut icon" href="img/favcon.ico">
</head>
<body>

<!-- -->
<h3 class="headline">　　　家具</h3>


	<s:if test="%{#session.id != null}">
		<s:include value="header_done.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>

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