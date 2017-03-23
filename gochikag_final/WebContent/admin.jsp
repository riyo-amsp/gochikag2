<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>管理者画面</title>
</head>
<body>

<a href="admin_item_register.jsp">商品登録</a>

<a href="admin_item_manage.jsp">商品検索/更新/削除</a>

<s:form action="AdminInfoAction">
	<s:hidden name="" value=""/>
	<s:submit value="お問い合わせ管理"/>
</s:form>

</body>
</html>