<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><s:text name="lang.kagu.title" /></title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="css/header_done.css">
<link rel="stylesheet" type="text/css" href="css/kagu_kaden_sale.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>
	<s:if test="%{#session.id != 0}">
		<s:include value="header_done.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>


	<h1>
		<br>
		<s:text name="%{itemName2}" />
		<br>
	</h1>


	<div class="top-wrapper">
		<h1>
			<s:text name="lang.kagu.furniture" />
			<s:text name="lang.kagu.item" />
			<s:text name="lang.kagu.list" />
		</h1>
	</div>
	<div class="searchBOX">
		<s:form action="ItemSearchAction">
			<select name="category">
				<option value="kagu">家具</option>
				<option value="kaden">家電</option>
				<option value="sale">セール</option>
			</select>
			<select name="searchSort">
				<option value="1">安い順</option>
				<option value="2">高い順</option>
				<option value="3">古い順</option>
				<option value="4">新着順</option>
				<option value="5">￥0-￥2499</option>
				<option value="6">￥3000-￥5000"</option>
			</select>
			<s:submit  value="検索" />
		</s:form>

	</div>
	<div class="form-wrapper">
		<s:iterator value="items">
			<s:iterator>
				<s:if test="%{itemCount % 2 == 0}">
					<form action="ItemAction" class="form1">
						<input type="hidden" name="itemId"
							value="<s:property value="itemId"/>" /> <input type="image"
							src="<s:property value="url"/>" class="image" />
						<div class="message">
							<p>
								<s:text name="lang.kagu.itemName" />
								:
								<s:property value="itemName" />
							</p>
							<p>
								<s:text name="lang.kagu.price" />
								:
								<s:property value="price" />
								<s:text name="lang.kagu.yen" />
							</p>
						</div>
					</form>
				</s:if>
				<s:else>
					<form action="ItemAction" class="form2">
						<input type="hidden" name="itemId"
							value="<s:property value="itemId"/>" /> <input type="image"
							src="<s:property value="url"/>" class="image" />
						<div class="message">
							<p>
								<s:text name="lang.kagu.itemName" />
								:
								<s:property value="itemName" />
							</p>
							<p>
								<s:text name="lang.kagu.price" />
								:
								<s:property value="price" />
								<s:text name="lang.kagu.yen" />
							</p>
						</div>
					</form>
				</s:else>
			</s:iterator>
		</s:iterator>
	</div>
</body>
</html>