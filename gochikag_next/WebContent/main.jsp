<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
	<s:include value="header_done.jsp" />


	<div class="container">

		<table
			style="width: 800px; padding-left: 50px; margin-left: auto; margin-right: auto;">
			<tr>
				<!-- kagu.jspへ遷移 : 実装済み -->
				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="kagu" />
					<td><input class="btn_a" type="submit" name="submit" value="" /></td>
				</s:form>

				<!-- kaden.jspへ遷移 : 実装済み -->
				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="kagen" />
					<td><input class="btn_b" type="submit" name="submit" value="" /></td>
				</s:form>

				<%-- 	<s:form action="CategoryAction"> --%>
				<%-- 		<s:hidden name="category" value="kaden"> --%>
				<!-- 	<a class="btn_d" -->
				<%-- 		href="<s:url action="CategoryAction"><s:param name="category" value="kaden"></s:param></s:url>">家電</a> --%>
				<%-- 		</s:hidden> --%>


				<!-- sale.jspへ遷移 : 実装済み -->
				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="sale" />
					<td><input class="btn_c" type="submit" name="submit" value="" /></td>
				</s:form>
			</tr>
		</table>
	</div>
	<div class="wrapper">
		<ul id="slideshow">
			<li class="current"><img src="img/interia.jpg" class="img"></li>
			<li><img src="img/child.jpg" class="img"></li>
			<li><img src="img/usagi.jpg" class="img"></li>
		</ul>
	</div>
<div align="center">
<%-- 		<c:import url="http://localhost:8080/openconnect/footer.jsp" /> --%>

	</div>

<!-- 		<table class="ranking-wrapper"> -->
<!-- 			<thead> -->
<!-- 			<tr> -->
<!-- 				<th scope="col">順位</th> -->
<!-- 				<th scope="col">家具</th> -->
<!-- 				<th scope="col">家電</th> -->
<!-- 				<th scope="col">セール</th> -->
<!-- 			</tr> -->
<!-- 			</thead> -->
<!-- 			<tbody> -->
<!-- 			<tr> -->
<!-- 				<td scope="row">1</td> -->
<!-- 				<td>いす</td> -->
<!-- 				<td>加湿器</td> -->
<!-- 				<td>ハンモック</td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td scope="row">2</td> -->
<!-- 				<td>ベット</td> -->
<!-- 				<td>ドライヤー</td> -->
<!-- 				<td>古時計</td> -->
<!-- 			</tr> -->
<!-- 			<tr> -->
<!-- 				<td scope="row">3</td> -->
<!-- 				<td>食器棚</td> -->
<!-- 				<td>冷蔵庫</td> -->
<!-- 				<td>バケツ</td> -->
<!-- 			</tr> -->
<!-- 			</tbody> -->
<!-- 		</table> -->
	
</body>
</html>