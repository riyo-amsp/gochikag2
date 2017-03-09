<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head><title>支払い</title>
</head>


<body>



	<h1>支払い方法/お届け先</h1>
	<br>
	<s:form action="PayAction">
		<s:textfield name="nameE" size ="10" maxlength = "10" label="姓"/>
		<%-- <s:textfield name="" size ="10" maxlength = "10" label="名" /> --%>
		<s:textfield name="creditNumber" size ="6" maxlength = "10" label="カード番号"/>
		<%--<s:textfield size ="6" maxlength = "6" />
		<s:textfield size ="6" maxlength = "6" />
		<s:textfield size ="6" maxlength = "6" />--%>
		<s:textfield name="securityCode" size ="4" maxlength = "4" label="セキュリティコード"/>
    	<s:textfield name="cardBrand" type="radio" value="VISA" label="VISA"/>
   		<s:textfield name="cardBrand" type="radio" value="MASTER" label="master"/>
    	<s:textfield name="cardBrand" type="radio" value="AMEX" label="american"/>
    	<s:hidden name="userId" value="1" />
 		<s:submit value="次へ" />
	</s:form>
	<br>



</body>
</html>