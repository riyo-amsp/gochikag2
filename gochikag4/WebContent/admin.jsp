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

<s:form action="AdminItemRegisterAction">
	<s:hidden name="" value=""/>
	<s:submit value="商品登録"/>
</s:form>

<s:form action="AdminItemManageAction">
	<s:hidden name="" value=""/>
	<s:submit value="商品検索/更新/削除"/>
</s:form>

<s:form action="AdminInfoAction">
	<s:hidden name="" value=""/>
	<s:submit value="お問い合わせ管理"/>
</s:form>

</body>
</html>