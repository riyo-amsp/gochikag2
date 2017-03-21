<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>購入手続き確認画面</title>
</head>
<body>
	<h2>お支払い方法</h2>
	<p><s:property value="cardBrand" /></p>
	<p><s:property value="lastFourDigits" /></p>
	<p><s:property value="firstSixDigits" /></p>
	
	<h2>注文詳細</h2>
	<s:form action="PayConfirmAction">
		<s:hidden name="loginId" value="%{loginId}" />
		<s:hidden name="lastName" value="%{lastName}" />
		<s:hidden name="firstName" value="%{firstName}" />
		<s:hidden name="nameE" value="%{nameE}" />
		<s:hidden name="cardBrand" value="%{cardBrand}" />
		<s:hidden name="firstSixDigits" value="%{firstSixDigits}" />
		<s:hidden name="totalPrice" value="%{totalPrice}"/>
		<s:submit value="注文確定" />
		<p>小計: <s:property value="totalPrice" /></p>
	</s:form>
	
	<s:form action="GoBackCartSelectAction">
		<s:submit value="買い物カゴへ戻る" />
	</s:form>
		
	<s:form action="GoBackCreditConfirmAction">
		<s:submit value="購入手続きへ戻る" />
	</s:form>
</body>
</html>