<%@ page language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />

	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.gochikag.property.adminItemRegister" var="lang" />

	<title><s:text name="lang.adminItemRegister.regi"/></title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/admin_item_register.css">
</head>
<body>
	<div class="title-wrapper">
		<h1>商品登録</h1>
	</div>

	<div class="form-wrapper">
		<form action="AdminItemRegisterAction">
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.itemName" /></p>
				<input type="text" name="itemName" required="required" class="form-control item-name">
			</div>
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.price" /></p>
				<input type="text" name="price" required="required" class="form-control price">
			</div>
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.stockNumber" /></p>
				<input type="text" name="stockNumber" required="required" class="form-control stock-number">
			</div>
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.mainPicture" /></p>
				<input type="text" name="mainPicture" required="required" class="form-control main-picture">
			</div>
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.subPicture1" /></p>
				<input type="text" name="subPicture1" required="required" class="form-control sub-picture1">
			</div>
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.subPicture2" /></p>
				<input type="text" name="subPicture2" required="required" class="form-control sub-picture2">
			</div>
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.subPicture3" /></p>
				<input type="text" name="subPicture3" required="required" class="form-control sub-picture3">
			</div>
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.detailJa" /></p>
				<input type="text" name="detailJa" required="required" class="form-control detail-ja">
			</div>
			<div class="form-item-wrapper">
				<p><s:text name="lang.adminItemRegister.detailEn" /></p>
				<input type="text" name="detailEn" required="required" class="form-control detail-en">
			</div>
			<div class="form-item-wrapper">
				<p>Category</p>
				<select name="category" class="form-control">
					<option value="kagu"><s:text name="lang.adminItemRegister.furniture"></s:text></option>
					<option value="kaden"><s:text name="lang.adminItemRegister.electricMachine"></s:text></option>
					<option value="sale"><s:text name="lang.adminItemRegister.sale"></s:text></option>
				</select>
			</div>
			<div class="form-submit">
				<input type="submit" value="<s:text name="lang.adminItemRegister.submit"/>" class="form-control" >
			</div>
		</form>
	</div>

<script src="js/admin_item_register.js"></script>
</body>
</html>