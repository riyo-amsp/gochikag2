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

    <s:form action="AdminAddAction">
    <s:textfield name="item_name" label="商品名"/>
    <s:textfield name="price" label="価格"/>
    <s:textfield name="item_count" label="在庫数" />
    <s:textfield name="registaration_date" label="登録日" />
    <s:textfield name="updated_date" label="更新日" />
    <s:textfield name="main_picture" label="写真" />
    <s:textfield name="pictures" label="サブ写真" />
    <s:textfield name="detail_ja" label="詳細（日本語）" />
    <s:textfield name="detail_en" label="詳細（英語）" />
    <s:textfield name="category" label="カテゴリー"/>
    

    <s:submit value="送信"/>
    </s:form>
</body>
</html>