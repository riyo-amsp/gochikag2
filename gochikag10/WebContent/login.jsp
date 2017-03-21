<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
	<title>login</title>
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
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
<body>
	<div align="center">
	<s:form action="LoginAction" class="login_form">
		<div class="form-group">
		<label for="Email">Email</label>
		<input type="text" name="phoneEmail" placeholder="Email"/>
		</div>
		<div class="form-group">
		<label for="password">Password</label>
		<input type="password" name="password" placeholder="Password"/>
		</div>
		<div class="form-group">
		<button type="submit" >login</button>
		</div>
	</s:form>
	</div>

</body>
</html>