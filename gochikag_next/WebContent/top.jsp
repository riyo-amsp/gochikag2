<%@ page language="java"
	contentType="text/html; charset=UTF-8"
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




<!-- ファビコンです　米島 -->

<link rel="shortcut icon" href="img/favcon.ico">




</head>
<body>
<script src="js/sakura.js"></script>

	<!-- ヘッダー読み込み -->
	<s:include value="header.jsp" />





	<!-- kagu.jspへ遷移 : 実装済み -->
		<p>
		<table><tr>
		<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
		<s:hidden name="category" value="kagu" />
		<td>
		<input class="btn_a" type="submit"name="submit"value="家具" />
		</td>
	</s:form>


	<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
		<s:hidden name="category" value="kagen" />
		<td><input class="btn_a" type="submit"name="submit"value="家電" /></td>
	</s:form>

	<!-- kaden.jspへ遷移 : 実装済み -->
	<%-- 	<s:form action="CategoryAction"> --%>
	<%-- 		<s:hidden name="category" value="kaden"> --%>
<!-- 	<a class="btn_d" -->
<%-- 		href="<s:url action="CategoryAction"><s:param name="category" value="kaden"></s:param></s:url>">家電</a> --%>
	<%-- 		</s:hidden> --%>


	<%-- 	</s:form> --%>

	<!-- sale.jspへ遷移 : 実装済み -->
	<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
		<s:hidden name="category" value="sale" />
		<td><input class="btn_a" type="submit"name="submit"value="セール" /></td>
	</s:form>
	</tr></table></p>









</body>
</html>