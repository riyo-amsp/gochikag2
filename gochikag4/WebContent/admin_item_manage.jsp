<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<title>商品検索</title>
</head>
<body>
	<p>カテゴリを選んでください</p>
	<s:form action= "AdminItemListAction">
		<select name="category">
			<option value="kagu">家具</option>
			<option value="kaden">家電</option>
			<option value="sale">セール</option>
		</select>
		<s:submit value="検索" />
	</s:form>
</body>

</html>