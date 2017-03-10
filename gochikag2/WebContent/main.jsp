<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>メイン画面</title>
</head>
<body>
	<p>ログインユーザー: <s:property value="#session.name" /></p>

	<!-- top.jspへ遷移 : 実装済み -->
	<s:form action="LogoutAction">
		<s:submit value="ログアウト"/>
	</s:form>



	<!--  my_page.jspへ遷移 : 実装済み -->
	<s:form action="MyPageAction">
		<!-- valueはのちにセッションから取得 value="%{#session.id}" -->
		<s:hidden name="userId" value="1" />
		<s:submit value="マイページ"/>
	</s:form>


	<!--  info.jspへ遷移 : aタグのため実装なし-->
	<a href="info.jsp">問い合わせ</a>


	<!-- 後で実装しまーす!!! -->
	<s:form action="CartUpdateAction">

		<s:submit value="カートへ" />
	</s:form>


	<!--  main.jspへ遷移 : aタグのため実装なし -->
	<a href="main.jsp">タイトル</a>



	<!-- kagu.jspへ遷移 : 実装済み -->
	<s:form action="CategoryAction">
		<s:hidden name="category" value="kagu"/>
		<s:submit value="家具" />
	</s:form>

	<!-- kaden.jspへ遷移 : 実装済み -->
	<s:form action="CategoryAction">
		<s:hidden name="category" value="kaden"/>
		<s:submit value="家電" />
	</s:form>

	<!-- sale.jspへ遷移 : 実装済み -->
	<s:form action="CategoryAction">
		<s:hidden name="category" value="sale"/>
		<s:submit value="セール" />
	</s:form>

</body>
</html>