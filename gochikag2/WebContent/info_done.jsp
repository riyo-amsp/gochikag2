<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>お問い合わせ完了</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

	<style>
	body {
		text-align:center;
		background-color:  #F9F8F4;
		}
	</style>
</head>
<body>
<!--  ここで"sタグ"を使ってheader.jspを読み込むよ -->


	<h1>お問い合わせ</h1>
	<h1>完了しました</h1>
<br><br><br><br><br><br><br><br><br>
	<s:property value="name"/><br>
	<s:property value="email"/><br>
	<s:property value="info"/><br>

	<a href="main.jsp">トップへ</a>

        <div>

        	<c:import url="http://localhost:8080/openconnect/footer.jsp" />

        </div>


</body>
</html>