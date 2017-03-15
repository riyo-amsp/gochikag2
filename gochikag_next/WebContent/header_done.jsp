<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>


<!-- cssは『header.jsp』と共同で『header.css』を使ってます-->

<link rel="stylesheet" type="text/css" href="css/header.css">



<html>
<body>
    <h1>＊"すべてが、かわいい。" アンティーク家具の通販サイト 『ごちかぐ』＊</h1>
	<h2><a href="top.jsp"><img class="item" src="img/logo.png"></a></h2>

<div class = "menu">
<!-- ログインユーザーの名前表示 ... 別に出さなくてもいいかも... -->
	<p>ログインユーザー: <s:property value="#session.name" /></p>

<!-- top.jspへ遷移 : 実装済み -->
	<s:form action="LogoutAction">
		<s:submit value="ログアウト"/>
	</s:form>


<!--  my_page.jspへ遷移 : 実装済み -->
	<s:form action="MyPageAction">
		<s:hidden name="userId" value="%{#session.id}" />
		<s:submit value="マイページ"/>
	</s:form>


<!--  info.jspへ遷移 : aタグのため実装なし-->
	<a href="info.jsp">問い合わせ</a>


<!-- cart.jspへ遷移 : 実装済み -->
	<s:form action="CartSelectAction">
		<s:submit value="カートへ" />
	</s:form>

	</body><HR size="8" color="#8b0000"></html>