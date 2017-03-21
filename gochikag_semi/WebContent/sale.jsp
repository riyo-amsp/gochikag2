<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>セール</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  	<style>
  		.top-wrapper{
  			width: 100%;
  			text-align: center;
  			margin-bottom: 40px;
  		}
  	
  		.form-wrapper{
  			width: 100%;
			clear: both;
			text-align: center;
			margin: 0 auto;
			font-size: 20px;
  		}
  		.form1{
  			width: 45%;
  			text-align: right;
  			float: left;
  			margin-right: 5%;
  			margin-bottom: 30px;
  		}	
  		.form2{
  			width: 45%;
  			margin: 0 auto;
  			text-align: left;
  			float: right;
  			margin-left: 5%;
  			margin-bottom: 30px;
  		}
  		.image {
  			opacity: 0.8;
  			width: 300px;
  			height: 300px;
  			border-radius: 10px;
  			transition: all 0.5s;
  		}
  		.image:hover{
  			opacity: 1.0;
  			border-radius: 150px;
  		}
  	</style>
</head>
<body>
	<s:if test="%{#session.id != 0}">
		<s:include value="header_done.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>
	
<h1>-----------------------------------------------------------------------</h1>	

<div class="top-wrapper">
	<h1>セール商品一覧</h1>
</div>	

<div class="form-wrapper">
	<s:iterator value="items">
		<s:iterator>
			<s:if test="%{itemCount % 2 == 0}">
				<form action="ItemAction" class="form1">
					<input type="hidden" name="itemId" value="<s:property value="itemId"/>" />
					<input type="image" src="<s:property value="url"/>" class="image" />
					<div class="message">
						<p>商品名: <s:property value="itemName" /></p>
						<p>価格: <s:property value="price" />円</p>
					</div>
				</form>
			</s:if>
			<s:else>
				<form action="ItemAction" class="form2">
					<input type="hidden" name="itemId" value="<s:property value="itemId"/>" />
					<input type="image" src="<s:property value="url"/>" class="image"/>
					<div class="message">
						<p>商品名: <s:property value="itemName" /></p>
						<p>価格: <s:property value="price" />円</p>
					</div>
				</form>
			</s:else>
		</s:iterator>
	</s:iterator>
</div>

</body>
</html>