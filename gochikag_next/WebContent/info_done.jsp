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
	<s:if test="%{#session.id != null}">
		<s:include value="header_done.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>

<img src="img/flowerline.png">


<link rel="stylesheet" type="text/css" href="css/info_done.css">


	<h1>お問い合わせが完了しました。<br>

お問い合わせいただきありがとうございました。<br>
お問い合わせを受け付けました。<br>

折り返し、担当者よりご連絡いたしますので、<br>
恐れ入りますが、しばらくお待ちください。<br>

なお、ご入力いただいたメールアドレス宛に受付完了メールを配信しております。<br>
完了メールが届かない場合、処理が正常に行われていない可能性があります。<br>
大変お手数ですが、再度お問い合わせの手続きをお願い致します。</h1>

	<s:property value="name"/><br>
	<s:property value="email"/><br>
	<s:property value="info"/><br>

	<a href="main.jsp">トップへ</a>
</body>
</html>