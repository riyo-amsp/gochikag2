<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	
  	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.gochikag.property.top" var="lang" />
	
	<title>メイン</title>
	
	<script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/slider.js"></script>
	
	<link rel="shortcut icon" href="img/favcon.ico">
	<link rel="stylesheet" type="text/css" href="css/sakura.css">
	<link rel="stylesheet" type="text/css" href="css/top.css">
</head>
<body>
	<!-- <script src="js/sakura.js"></script> -->
	<s:include value="header_done.jsp" />

	<div class="container">
		<table
			style="width: 800px; padding-left: 50px; margin-left: auto; margin-right: auto;">
			<tr>
				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="kagu" />
					<td><input class="btn_a" type="submit" value=""/></td>
				</s:form>

				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="kaden" />
					<td><input class="btn_b" type="submit" value=""/></td>
				</s:form>

				<s:form action="CategoryAction" cssClass="btn_a" theme="css_xhtml">
					<s:hidden name="category" value="sale" />
					<td><input class="btn_c" type="submit" value=""/></td>
				</s:form>
			</tr>
		</table>
	</div>
	<div class="wrapper">
		<ul id="slideshow">
			<li class="current"><img src="img/top-header-mainimg/house.jpg" class="img"></li>
			<li><img src="img/top-header-mainimg/room.jpg" class="img"></li>
			<li><img src="img/top-header-mainimg/rabit.jpg" class="img"></li>
		</ul>
	</div>

	<div align="center">
		<%-- <c:import url="http://localhost:8080/openconnect/footer.jsp" /> --%>
	</div>
</body>
</html>