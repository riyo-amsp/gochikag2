<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>商品登録</title>
</head>
<body>

    <s:form action="Adminction">
    <s:textfield name="item_name" label="商品名"/>
    <s:textfield name="price" label="価格"/>
    <s:textfield name="category" label="カテゴリー"/>

    <s:submit value="送信"/>
    </s:form>
</body>
</html>