<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="java.util.*"%>





<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>商品登録</title>

	<style>
		.manage {
			display: block;
			text-align: right;
		}

		.contents{
		align: right
		}
	</style>


</head>
<body>
    <div class=contents>
	<s:form action="AdminAddAction">
		<s:textfield name="itemName" label="商品名" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="price" label="価格" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="itemCount" label="在庫数" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="mainPicture" label="写真" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="pictures" label="サブ写真" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="detailJa" label="詳細（日本語）" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="detailEn" label="詳細（英語）" required="required" cssClass="manage" theme="css_xhtml"/>
		<select name="category">
			<option value="kagu">家具</option>
			<option value="kaden">家電</option>
			<option value="sale">セール1</option>
		</select>
		<s:submit value="送信" cssClass="manage" theme="css_xhtml"/>
	</s:form>
	</div>
</body>
</html>