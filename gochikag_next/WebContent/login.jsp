<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ログイン</title>

<head>
<!-- ファビコンです　米島 -->

<link rel="shortcut icon" href="img/favcon.ico">

<style>
	th {
	background-color:  #990000;}

	.inputBox{
	margin:0px 0px 0px 0px;
	padding:0px 00px 0px 10px;
	width:130px;
	height:20px;
	background-color:white;
	border:none;
	outline:none;
	color:#FFFFFF;
}

	</style>
</head>


</head>
<body>
	<s:include value="header.jsp" />
	<h2>Login to your account</h2>
	<hr>
	<table>
		<s:form action="LoginAction">
			<tr>
				<th>name</th>
				<th><s:textfield name="name" /></th>
			</tr>
			<tr>
				<th>pass</th>

				<th class="inputBox"><s:password name="password" /></th>

			</tr>
			<td><s:submit value="送信" /></td>
		</s:form>
	</table>





	<!-- 後でOAUTH機能追加します -->
	<!-- TWITTERだよ -->
	<a href="<s:url action="TwitterAction"/>"> <img src="twitter-j.png" />
	</a>
</body>
</html>