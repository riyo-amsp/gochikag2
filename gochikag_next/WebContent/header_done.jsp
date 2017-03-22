<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>



<link rel="stylesheet" type="text/css" href="css/header_done.css">


<html>

<body>

	<div class="menu">

<a href="top.jsp" class="ika">　　＊”すべてが、かわいい。”アンティークの家具なら、「ごちかぐ」でご注文をどうぞ！＊</a>

		<!-- ログインユーザーの名前表示 ... 別に出さなくてもいいかも... -->




		<!-- top.jspへ遷移 : 実装済み -->
		<!--  my_page.jspへ遷移 : 実装済み -->
		<!--  info.jspへ遷移 : aタグのため実装なし-->
		<!-- cart.jspへ遷移 : 実装済み -->
		<div align="right">
			<table>
				<th><s:form action="LogoutAction" class="karasi">
						<input type=submit name=submit value="ログアウト">
					</s:form></th>
				<th><s:form action="MyPageAction" class="karasi">
						<s:hidden name="userId" value="%{#session.id}" />
						<s:submit value="マイページ" />
					</s:form></th>
				<th><div class="karasi">
						<a href="info.jsp">お問い合わせ</a>
					</div>
				<th><s:form action="CartSelectAction" class="karasi">
						<s:submit value="カートへ"/>
					</s:form></th>
				</div></table></div><hr color="Salmon" width="100%" size="10" />
		<div class="aaa">
						<div class="logo">
			<a href="top.jsp"><img class="logo" src="img/top-header-mainimg/logo.png"></a>
			</div>


		</div>
	</div>

</body>

</html>