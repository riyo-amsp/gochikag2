<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="property.infoDone" var="lang" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><s:text name="lang.infoDone.top"/></title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<style>
		BODY{
			background-size :  30%;
			background-image : url("img/usagi.jpg");
			background-repeat : no-repeat;
			background-position : 10% 60%;
			background-attachment : fixed;
		}

		.container{
			width : 30%;
			height : 50%;
			margin : 100px auto;
			padding : 50px auto;
		}
		.button,.panel-heading{
			text-align : center;
		}
	</style>
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

	<script>
		function jump(){
			if(window.sessionStorage.length==0){
				location.href="top.jsp";
			}else{
				location.href="main.jsp";
			}
		}
	</script>
</body>
</html>