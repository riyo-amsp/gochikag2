<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品一覧</title>
</head>
<body>


	<table border="1">

		<tr>
			<th>商品名</th>
			<th>価格</th>
			<th>在庫</th>
		</tr>


		<tr>
			<td>
					<s:property value="nameList" />
				</td>
			<td><s:iterator value="priceList">
					<s:property value="priceList" />
				</s:iterator></td>
			<td><s:iterator value="countList">
					<s:property value="countList" />
				</s:iterator></td>
		</tr>

	</table>


</body>
</html>