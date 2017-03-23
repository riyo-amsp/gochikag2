<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib prefix="s" uri="/struts-tags"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="property.adminItemRegister" var="lang" />
	<title><s:text name="lang.adminItemRegister.regi"/></title>
	<style>
		.manage {
			display: block;
		}
	</style>
</head>
<body>

	<s:form action="AdminItemRegisterAction">
		<s:textfield name="itemName" label="%{getText('lang.adminItemRegister.itemName')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="price" label="%{getText('lang.adminItemRegister.price')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="stockNumber" label="%{getText('lang.adminItemRegister.stockNumber')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="mainPicture" label="%{getText('lang.adminItemRegister.mainPicture')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="subPicture1" label="%{getText('lang.adminItemRegister.subPicture1')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="subPicture2" label="%{getText('lang.adminItemRegister.subPicture2')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="subPicture3" label="%{getText('lang.adminItemRegister.subPicture3')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="detailJa" label="%{getText('lang.adminItemRegister.detailJa')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<s:textfield name="detailEn" label="%{getText('lang.adminItemRegister.detailEn')}" required="required" cssClass="manage" theme="css_xhtml"/>
		<select name="category">
			<option value="kagu"><s:text name="lang.adminItemRegister.furniture"></s:text></option>
			<option value="kaden"><s:text name="lang.adminItemRegister.electricMachine"></s:text></option>
			<option value="sale"><s:text name="lang.adminItemRegister.sale"></s:text></option>
		</select>
		<s:submit value="%{getText('lang.adminItemRegister.submit')}" cssClass="manage" theme="css_xhtml"/>
	</s:form>
</body>
</html>