<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>


<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	
  	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.gochikag.property.top" var="lang" />
	
	<title>トップ</title>
	
	<script src="js/jquery-3.1.1.min.js"></script>
	<script src="js/slider.js"></script>
	
	<link rel="shortcut icon" href="img/favcon.ico">
	<link rel="stylesheet" type="text/css" href="css/sakura.css">
	<link rel="stylesheet" type="text/css" href="css/top.css">
</head>
<body>
	<!--  <script src="js/sakura.js"></script> -->
	<s:include value="header.jsp" />

<center><img src="img/top-header-mainimg/line.png">
<br><br>
<img src="img/top-header-mainimg/menu.png">

</center>

<br><br>

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
	
<br><br>

	
	<center><img src="img/top-header-mainimg/line.png">
	<br><br>
	<img src="img/top-header-mainimg/topic.png">
	</center>
	
<br>
		
		<center>
		<img src="img/top-header-mainimg/comment.png">
		
		<br><br>

		</center>
	
	<div class="wrapper">
		<ul id="slideshow">
			<li class="current"><img src="img/top-header-mainimg/rabit.jpg" class="img"></li>
			<li><img src="img/top-header-mainimg/room.jpg" class="img"></li>
			<li><img src="img/top-header-mainimg/house.jpg" class="img"></li>
		</ul>
	</div>
	<br><br>
	<center><img src="img/top-header-mainimg/line.png">
	<br><br>
	<img src="img/top-header-mainimg/access.png">
	</center>
	
	<br><br>
	
	
		<div class="map">
		<!-- マップ -->
		<center>
		<iframe
			src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d481.61675142730866!2d139.7670410021531!3d35.70362563672109!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x60188c18b82a5b79%3A0xf4b11fd9c5add54c!2z44CSMTEzLTAwMzQg5p2x5Lqs6YO95paH5Lqs5Yy65rmv5bO277yT5LiB55uu77yS4oiS77yR77ySIOW-oeiMtuODjuawtOWkqeelnuODk-ODqw!5e0!3m2!1sja!2sjp!4v1486604994320"
		style="width: 500px; height: 350px"/></iframe>
	</center>
	
	<br><br>
	<center><img src="img/top-header-mainimg/line.png"></center>
	
	
	<br><br>
	
	
	<div align="center">
	<%-- <c:import url="http://localhost:8080/openconnect/footer.jsp" /> --%>
	</div>

</body>
</html>