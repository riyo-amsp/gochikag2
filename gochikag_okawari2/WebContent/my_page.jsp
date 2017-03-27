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

	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="com.internousdev.gochikag.property.myPage" var="lang"/>

	<title><s:text name="lang.myPage.MyPage" /></title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" type="text/css" href="css/my_page.css">
</head>
<body>
	<s:include value="header_done.jsp" />

	<div class="my-page-header-wrapper">
		<h1><s:text name="lang.myPage.PurchaseHistory" /></h1>
	</div>

	<!-- 購入履歴の処理にD3.jsを加える予定 -->
	<s:if test="%{!myInfo.isEmpty()}">
		<div class="table-wrapper">
			<table class="table table-bordered">
				<tr class="something">
					<th class="text-center col-md-4"><s:text name="lang.myPage.PurchaseDate" /></th>
					<th class="text-center col-md-4"><s:text name="lang.myPage.ItemName" /></th>
					<th class="text-center col-md-4"><s:text name="lang.myPage.Amount" /></th>
				</tr>
				<s:iterator value="myInfo">
					<s:iterator>
						<tr class="something">
							<td class="text-center col-md-4"><s:property value="date" /></td>
							<td class="text-center col-md-4"><s:property value="itemName" /></td>
							<td class="text-center col-md-4"><s:property value="amount" /></td>
						<tr>
					</s:iterator>
				</s:iterator>
			</table>
		</div>
	</s:if>
	<s:else>
		<div class="message-wrapper">
			<h3><s:text name="lang.myPage.NothingIsHere" /></h3>
		</div>
	</s:else>

	<div class="my-page-footer">
		<a href="main.jsp"><s:text name="lang.myPage.Top" /></a>
	</div>
</body>
</html>