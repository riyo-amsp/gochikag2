<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品登録</title>
</head>
<body>

	<s:form action="AdminAddAction">
       <s:textfield name="itemName" label="商品名" required="required" />
    <s:textfield name="price" label="価格" required="required" />
    <s:textfield name="itemCount" label="在庫数" required="required" />
    <s:textfield name="mainPicture" label="写真" required="required" />
    <s:textfield name="pictures" label="サブ写真" required="required" />
    <s:textfield name="detailJa" label="詳細（日本語）" required="required" />
    <s:textfield name="detailEn" label="詳細（英語）" required="required" />
    <s:textfield name="category" label="カテゴリー" required="required" />
		<s:submit value="送信" />
	</s:form>
</body>
</html>