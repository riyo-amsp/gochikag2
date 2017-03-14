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
			<option value="a">家具</option>
			<option value="b">家電</option>
			<option value="c">セール</option>

		</select>

		<s:hidden name="category" value="category">
			<s:submit value="検索">
			</s:submit>
		</s:hidden>

	</s:form>
</body>

</html>