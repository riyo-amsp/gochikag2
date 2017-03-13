<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品詳細</title>
</head>
<body>
	<p><s:property value="dto.detailJa" /></p>
	<p><s:property value="dto.itemName"/></p>
	<p><s:property value="dto.price" /></p>
	<img src="<s:property value="dto.mainPicture" />" >
	<img src="<s:property value="dto.pictures" />" >

	<s:form action="CartInsertAction">
		<s:hidden name="price" value="%{price}" />
		<s:hidden name="itemId" value="%{itemId}" />
		<s:select name="itemCount" list="countList" />
		<s:submit value="カートへ" />
	</s:form>
</body>
</html>