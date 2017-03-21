<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>商品管理</title>
	<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
	<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
	<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<s:form action="AdminItemManageAction">
		<select class="parent" name="category">
			<option value="" selected="selected">カテゴリーを選択</option>
			<option value="kagu">家具</option>
			<option value="kaden">家電</option>
			<option value="sale">セール</option>
		</select>
		<button type="submit" class="btn btn-success">検索</button>
	</s:form>
	
	<s:if test="%{!nameList.isEmpty()}">
		<s:form action="AdminItemManageAction">
			<s:hidden name="category" value="%{category}"/>
			<s:select name="itemName" list="nameList" />
			<s:submit value="検索" />
		</s:form>
	</s:if>
	
	
</body>
</html>