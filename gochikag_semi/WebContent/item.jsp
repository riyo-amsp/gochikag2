<%@ page language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<fmt:setLocale value="${pageContext.request.locale.language}" />
<fmt:setBundle basename="property.gochikag.property.item" var="lang" />
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>商品詳細</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  	<style>
  		html, body,
		ul, ol, li,
		h1, h2, h3, h4, h5, h6, p, div {
  			margin: 0;
  			padding: 0;
		}
		li {
  			list-style: none;
		}
		a {
  			text-decoration: none;
		}

		.contents-wrapper{
			width: 100%;
		}

		.sub-pictures-wrapper{
			width: 15%;
			float: left;
			margin: 0;
			text-align: center;
		}

		.sub-pictures-wrapper li{
			width: 150px;
			height: 150px;
			margin: 0 auto 10px auto;
		}

		.sub-pictures-wrapper img{
			width: 80%;
			height: 148px;
			border: 1px solid black;
		}

		.main-picture-wrapper{
			width: 35%;
			float: left;
			margin: auto 0;
			text-align: center;
		}

		.main-picture-wrapper img{
			width: 80%;
			height: 468px;
			border: 1px solid black;
		}

		.message-wrapper{
			width: 30%;
			float: left;
		}

		.form-wrapper{
			width: 20%;
			float: left;
		}


  	</style>
</head>
<body>
<h1><s:text name = "lang.item.itemDetail" /></h1>
	<s:if test="%{#session.id != 0}">
		<s:include value="header_done.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>

	<h1>-----------------------------------------------------------------------</h1>
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
			<h2><s:property value="dto.itemName"/></h2>
			<p><s:property value="dto.detailJa" /></p>
			<p><s:property value="dto.price" /></p>
		</div>

		<div class="form-wrapper">
			<s:form action="CartInsertAction">
				<s:hidden name="price" value="%{price}" />
				<s:hidden name="itemId" value="%{itemId}" />
				<s:select name="itemCount" list="stockNumberList" />
				<s:submit value="カートへ" />
			</s:form>
		</div>
	</div>

	<script>
		$(function(){
			var $main_url = $('.main').attr('src');
			$('.sub-img').hover(
				function(){
					 var $sub_url = $(this).attr('src');
					 $('.main-img').attr('src', $sub_url);
					 $(this).attr('src', $main_url);
				},
				function(){
					var $sub_url = $(this).attr('src');
					 $('.main-img').attr('src', $main_url);
					 $(this).attr('src', $sub_url);
				});
		});

	</script>


</body>
</html>