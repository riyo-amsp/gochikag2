<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="property.login" var="lang" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<style>
	.form-wrapper{
		width:40%;
		margin:0 auto;
	}
	.form-wrapper button{
		width:30%;
		margin:0 auto;
	}

	.oauth-wrapper{
		width: 80%;
		margin: 30px auto;
	}

	.oauth-wrapper a{
		dispaly: block;
		float: left:
		width: 30%;
	}

	.error-message{
		text-align : center;
		color : red;
	}
	</style>
</head>
<body>
	<div>
	<s:include value="header.jsp" />
	</div>

	<!-- エラーメッセージの表示 -->
	<div class="error-message">
		<s:if test="errorFlg==true">
			<!-- email&password エラー : 入力内容が間違っています。 -->
			<s:text name="lang.login.incorrect"/>
		</s:if>

	</div>

	<div class="form-wrapper">
		<s:form action="LoginAction">
			<div class="form-group">
				<label for="phoneEmail">Email address</label>
				<input type="email" name="phoneEmail" class="form-control" placeholder="Email address" required/>
			</div>
			<div class="form-group">
				<label for="password">password</label>
				<input type="password" name="password" class="form-control" placeholder="password"
					   pattern="^[0-9A-Za-z]+$" title="半角英数字で入力してください。" maxlength="256" required/>
			</div>
				<button type="submit" class="form-control" >login</button>
		</s:form>
	</div>
<!-- 後でOAUTH機能追加します -->
<div class="oauth-wrapper">
	<!-- TWITTERだよ -->
	<a href="<s:url action="TwitterAction"/>">
    	<img src="twitter-j.png"/>
    </a>

	<!-- FACEBOOK -->
	<a href="<s:url action="LoginFacebook" />">FACEBOOK</a>
</div>

</body>
</html>