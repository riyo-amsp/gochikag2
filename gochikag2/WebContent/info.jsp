<%@ page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- sタグの宣言をここにするよ  -->
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- cタグの宣言をここにするよ  -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>お問い合わせ</title>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
body{
  background-color:  #F9F8F4;
}
.contents {
width: 600px;
margin: 0 auto;
}
.contents h1 {
text-align: center;
}

.contents h2 {
text-align: center;
}
.submit {
text-align: center;
}

</style>
</head>
<body>
<!--  ここで"sタグ"を使ってheader_done.jspを読み込むよ -->
<s:include value="header_done.jsp"></s:include>


<!--  ↓actionでデータ飛ばす！ -->

<s:form action="InfoAction">
	<div class="container">
		<div class="contents">
			<h1>お問い合わせ</h1>

			<div>
				<h2> <s:textfield name="name" label = "名前"/></h2>
				<h2> <s:textfield name="email" label = "メールアドレス"/></h2>

				<h2>
					<s:textfield name="info" size="45" label = "内容"/>
				</h2>
		</div>
	</div>
</div>

	<s:submit value="送信"/>
</s:form>

<s:property value="name"/>
<s:property value="email"/>
<s:property value="info"/>



<!-- ここで"cタグ"を使ってfooter.jspを読み込むよ -->
<div align="center">
		<c:import url="http://localhost:8080/openconnect/footer.jsp" />
</div>
</body>
</html>