<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>メイン画面</title>
</head>
<body>
	
	<s:include value="header_done.jsp" />

	<!-- kagu.jspへ遷移 : 実装済み -->
	<s:form action="CategoryAction">
		<s:hidden name="category" value="kagu"/>
		<s:submit value="家具" />
	</s:form>
	
	<!-- kaden.jspへ遷移 : 実装済み -->
	<s:form action="CategoryAction">
		<s:hidden name="category" value="kaden"/>
		<s:submit value="家電" />
	</s:form>
	
	<!-- sale.jspへ遷移 : 実装済み -->
	<s:form action="CategoryAction">
		<s:hidden name="category" value="sale"/>
		<s:submit value="セール" />
	</s:form>

</body>
</html>