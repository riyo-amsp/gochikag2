<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- sタグの宣言をここにするよ  -->
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>商品情報</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<style>
		body{
  			background-color:  #F9F8F4;
		}
		li {
			list-style: none;
		}


		.cart{
			margin-top: 300px;
			margin-left: 200px;
		}
	</style>
</head>
<body>

<!--  ここで"sタグ"を使ってheader_done.jspを読み込むよ -->
<div>
					<s:form action="CartInsertAction">
					<select name="itemCount">
						<option value="0" selected>0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
					</select>
					<s:hidden name="itemCount" value="itemCount"/>


					<s:submit value="カートへ"/>
					</s:form>

				</div>

  <div align="center">
  </div>
</body>
</html>