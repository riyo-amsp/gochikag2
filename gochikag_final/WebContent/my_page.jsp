<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<fmt:setLocale value="${pageContext.request.locale.language}"/>
	<fmt:setBundle basename="property.my_page" var="lang"/>

	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><s:text name="lang.myPage.MyPage" /></title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" type="text/css" href="css/my_page.css">

</head>
<body>
	<div class="body-design">
	<s:include value="header_done.jsp" />

	<div class="my-page-header-wrapper">
		<h1><s:text name="lang.myPage.PurchaseHistory" /></h1>
	</div>

	<!-- 購入履歴の処理にD3.jsを加える予定 -->
	<s:if test="%{!myInfo.isEmpty()}">
		<div class="table-wrapper">
			<table class="table-bordered" align="center">
				<thead>
				<tr class="something">
					<th class="text-center col-md-4"><s:text name="lang.myPage.PurchaseDate" /></th>
					<th class="text-center col-md-4"><s:text name="lang.myPage.ItemName" /></th>
					<th class="text-center col-md-4"><s:text name="lang.myPage.Amount" /></th>
				</tr>
				</thead>
				<s:iterator value="myInfo">
					<s:iterator>
					<tbody>
						<tr class="something">
							<td class="text-center col-md-4"><s:property value="date" /></td>
							<td class="text-center col-md-4"><s:property value="itemName" /></td>
							<td class="text-center col-md-4"><s:property value="amount" /></td>
						</tr>
						</tbody>
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
	
	<div align="center">
	<ul class="botan">
	<li><a href="#"><span class="check">check</span></a></li>
	</ul></div>

	<div align="center">
	<ul class="botan">
	<li><a href="#"><span class="sample2">stripe</span></a></li>
  <li><a href="#"><span class="sample3">Diagonal stripe</span></a></li>
  <li><a href="#"><span class="sample4">Vertical stripe</span></a></li>
 <li> <a href="#"><span class="sample5">Diagonal check</span></a></li>
  <li><a href="#"><span class="a">Plaid</span></a></li>
 <li> <a href="#"><span class="b">b</span></a></li>
  <li><a href="#"><span class="c">c</span></a></li>
  <li><a href="#"><span class="d">d</span></a></li>
 <li> <a href="#"><span class="e">e</span></a></li>
  <li><a href="#"><span class="sample7">Check 2</span></a>
</ul>
</div>

	</div>
</body>
</html>