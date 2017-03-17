<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/header.css">
<link rel="stylesheet" type="text/css" href="css/top.css">
<link rel="stylesheet" type="text/css" href="css/sakura.css">
<title>トップ</title>
<script src="js/jquery-3.1.1.min.js"></script>

<script src="js/slider.js"></script>

<style>
</style>




<!-- ファビコンです　米島 -->

<link rel="shortcut icon" href="img/favcon.ico">




</head>
<body>
	<script src="js/sakura.js"></script>

	<!-- ヘッダー読み込み -->
	<s:include value="header.jsp" />


	<div class="container">

		<table style="width: 400px; margin-left: auto; margin-right: auto;">
			<tr>
				<!-- kagu.jspへ遷移 : 実装済み -->
				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="kagu" />
					<td><input class="btn_a" type="submit" name="submit"
						value="" /></td>
				</s:form>

				<!-- kaden.jspへ遷移 : 実装済み -->
				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="kagen" />
					<td><input class="btn_b" type="submit" name="submit"
						value="" /></td>
				</s:form>

				<%-- 	<s:form action="CategoryAction"> --%>
				<%-- 		<s:hidden name="category" value="kaden"> --%>
				<!-- 	<a class="btn_d" -->
				<%-- 		href="<s:url action="CategoryAction"><s:param name="category" value="kaden"></s:param></s:url>">家電</a> --%>
				<%-- 		</s:hidden> --%>


				<!-- sale.jspへ遷移 : 実装済み -->
				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="sale" />
					<td><input class="btn_c" type="submit" name="submit"
						value="" /></td>
				</s:form>
			</tr>
		</table>
	</div>
	<div class="wrapper">
		<ul id="slideshow">
			<li class="current"><img src="img/house３.jpg" class="img"></li>
			<li><img src="img/house4.jpg" class="img"></li>
		</ul>
	</div>
</body>
</html>