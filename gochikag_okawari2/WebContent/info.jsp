<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">

	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.gochikag.property.info" var="lang" />

	<title><s:text name="lang.info.top"/></title>

	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<link rel="stylesheet" type="text/css" href="css/info.css">

	</head>
	<body>
		<s:if test="%{#session.id != 0}">
			<s:include value="header_done.jsp" />
		</s:if>
		<s:else>
			<s:include value="header.jsp" />
		</s:else>


		<form action="InfoMongoAction">
			<div class="container">
				<div class="panel panel-danger">
					<div class="panel-heading" align="center">
						<h2><s:text name="lang.info.heading"/></h2>
					</div>
					<div class="panel-body" align="center">
						<p class="left"><s:text name="lang.info.title"/>(*)<br>
							<input type="text" name="title" required/></p>
						<p class="left"><s:text name="lang.info.name"/>(*)<br>
							<input type="text" name="name" required/></p>
						<p class="left"><s:text name="lang.info.mail"/>(*)<br>
							<input type="email" name="mail" required/></p><br>
						<p class="left"><s:text name="lang.info.info"/>(*)<br>
							<textarea name="info" cols="40" rows="20" required></textarea></p>
							<small>(*)<s:text name="lang.info.required"/></small><br>
					</div>
					<div class="panel-footer" align="center">
						<input type="submit" value="<s:text name="lang.info.submit"/>"/>
					</div>
				</div>
			</div>
		</form>

		<div class="button">
			<input type="button" name="link" onclick="jump()" value="<s:text name="lang.info.goTop"/>"/>
		</div>

	<script src="js/info.js"></script>
	</body>
</html>