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
	<fmt:setBundle basename="com.internousdev.gochikag.property.admin" var="lang" />

	<title><s:text name="lang.admin.admin"/></title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<link rel="stylesheet" type="text/css" href="css/admin.css">


</head>
<body>
	<div class="heading">
		<h1><s:text name="lang.admin.heading"/></h1>
	</div>
	<p class="button">
		<input type="button" onClick="location.href='admin_item_register.jsp'"
			   value="<s:text name="lang.admin.regi"/>"
			   class="btn"/>
	</p>
	<p class="button">
		<input type="button" onClick="location.href='admin_item_manage.jsp'"
			   value="<s:text name="lang.admin.manage"/>"
			   class="btn"/>
	</p>
	<div class="button">
		<form action="AdminInfoAction">
			<input type="submit" value="<s:text name="lang.admin.infoManage"/>"
			class="btn"/>
		</form>
	</div>

</body>
</html>