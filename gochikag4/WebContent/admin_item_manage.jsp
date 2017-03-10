<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="./js/jquery-3.1.1.min.js"></script>
<script src="./js/admin-control.js"></script>


<title>Insert title here</title>
</head>
<body>
	<p>カテゴリを選んでください</p>
	<select id="category">
		<option value="">-----------</option>
		<option value="a">家具</option>
		<option value="b">家電</option>
		<option value="c">セール</option>
	</select>

	<p>製品を選んでください</p>
	<select id="product">
		<option value="">-----------</option>
	</select>

</body>

</html>