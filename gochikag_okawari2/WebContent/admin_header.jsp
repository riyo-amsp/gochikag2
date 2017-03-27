<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<link rel="stylesheet" type="text/css" href="css/admin_header.css">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="menu">
		<div align=right>
			<s:form action="LogoutAction" class="admin_header-form">
				<s:submit type="image" src="img/top-header-mainimg/top3.png" />
			</s:form>
		</div>
		<hr color="Salmon" width="100%" size="10" />
		<div class="admin_heaader">
			<div class="back-img">
				<div class="logo">
					<a href="admin.jsp"><img class="logo"
						src="img/top-header-mainimg/logo.png"></a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>