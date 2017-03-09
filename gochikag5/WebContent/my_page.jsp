<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>マイページ</title>
</head>
<body>
	<!-- 実際に実装する際にはsessionからユーザー名を取得して表示 -->
	<h1>ログインユーザー : <s:property value="#session.name" /></h1>
	
	<!-- 購入履歴の処理にD3.jsを加える予定 -->
	<table>
		<tr>
			<th>購入日</th>
			<th>商品名</th>
			<th>合計金額</th>
		</tr>
		
			<s:iterator value="myInfo">
				<s:iterator>
					<tr>
						<td><s:property value="date" /></td>
						<td><s:property value="itemName" /></td>
						<td><s:property value="amount" /></td>
					<tr>
				</s:iterator>
			</s:iterator>
	</table>
	<a href="main.jsp">トップへ</a>
</body>
</html>