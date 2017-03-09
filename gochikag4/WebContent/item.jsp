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

			<s:form action="PayAction">
			<s:select name="choice" list="countList" />
			<s:hidden name="itemId" value="%{dto.itemId}" />
			<s:submit value="送信" />
			</s:form>
</body>
</html>