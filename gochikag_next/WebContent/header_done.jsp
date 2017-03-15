<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!-- あとでいい感じにデザインお願いします -->
	<a href="main.jsp">
		<h1>ごちカグ!</h1>
	</a>

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
