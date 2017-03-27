<%@ page language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	
  	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.gochikag.property.item" var="lang" />
	
	<title><s:text name="lang.item.itemDetail"/></title>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  	
  	<script src="js/item.js"></script>
  	<link rel="stylesheet" type="text/css" href="css/item.css">
</head>
<body>
	<s:if test="%{#session.id != 0}">
		<s:include value="header_done.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>

	<div class="contents-wrapper">
		<ul class="sub-pictures-wrapper">
			<li><img src="<s:property value="dto.subPicture1"/>" class="sub-img" ></li>
			<li><img src="<s:property value="dto.subPicture2" />" class="sub-img" ></li>
			<li><img src="<s:property value="dto.subPicture3" />" class="sub-img" ></li>
		</ul>

		<div class="main-picture-wrapper">
			<img src="<s:property value="dto.mainPicture" />" class="main-img">
		</div>

		<div class="message-wrapper">
			<h2 class="title"><s:property value="dto.itemName"/></h2>
			<div class="detail">
				<h4><s:text name="lang.item.detail"/>:</h4>
				<p><s:property value="dto.detailJa" /></p>
				<p><s:property value="dto.detailEn" /></p>
			</div>
			<div class="detail">
				<h4><s:text name="lang.item.price"/>: <s:property value="dto.price" /><s:text name="lang.item.yen"/></h4>
			</div>

			<div class="form-wrapper">
				<form action="CartInsertAction">
					<input type="hidden" name="price" value="<s:property value="price"/>" />
					<input type="hidden" name="itemId" value="<s:property value="itemId"/>"  />
					<div class="select-wrapper">
						<h4><s:text name="lang.item.quantity"/>:</h4>
						<s:select name="itemCount" list="stockNumberList" cssClass="form-control" theme="css_xhtml"/>
					</div>
					<input type="submit" value="<s:text name="lang.item.cart"/>" class="form-control submit"/>
				</form>
			</div>
		</div>
	</div>

</body>
</html>