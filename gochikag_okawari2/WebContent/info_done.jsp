<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">

  	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.gochikag.property.infoDone" var="lang" />

	<title><s:text name="lang.infoDone.top"/></title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<link rel="stylesheet" type="text/css" href="css/info_done.css">

</head>
<body>
<!--  ここで"sタグ"を使ってheader.jspを読み込むよ -->
	<s:if test="%{#session.id != 0}">
		<s:include value="header_done.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-heading">
				<b><s:text name="lang.infoDone.heading"/></b>
			</div>
			<div class="panel-body" align="center">
				<dl>
					<dt><s:text name="lang.infoDone.title"/></dt>
						<dd><s:property value="title"/></dd>
					<dt><s:text name="lang.infoDone.name"/></dt>
						<dd><s:property value="name"/></dd>
					<dt><s:text name="lang.infoDone.mail"/></dt>
						<dd><s:property value="mail"/></dd>
					<dt><s:text name="lang.infoDone.info"/></dt>
						<dd><s:property value="info"/></dd>
				</dl>
			</div>
			<div class="panel-footer">
				<s:property value="date"/>
			</div>
		</div>
	</div>

	<div class="container">
		<div class="panel panel-default">
			<div class="panel-body" align="center">
				<s:text name="lang.infoDone.you"/><br><s:text name="lang.infoDone.thank"/>
			</div>
		</div>
	</div>

	<div class="button">
		<input type="button" name="link" onclick="jump()" value="<s:text name="lang.infoDone.goTop"/>"/>
	</div>

	<script src="js/info.js"></script>
</body>
</html>