<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<!-- sタグの宣言をここにするよ  -->
  <%@ taglib uri="/struts-tags" prefix="s" %>

<!-- cタグの宣言をここにするよ  -->

<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	  	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>カート画面</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	</head>
	<style>
	body{
  		background-color:  #F9F8F4;
  	}

	article{
		width: 400px;
		margin:0 auto;
	}

	</style>


	<body>

		<article>


		<!-- カートトップ -->
		<s:property value="item_id" />
		<s:property value="item_count" />


		<!-- カートリスト -->






		<!--  数量選択ボタン -->

		<s:form action="CartUpdateAction">

			<!-- ★item_id=1と設定中 -->
			<input type="hidden" name="item_id" value="1"/>
			<select name="item_count" onChange="this.form.submit()">

			<!-- 数量選択し、action後は、設定した数量を表示 -->
			<option value="<s:property value="item_count"/>" selected>
			<s:property value="item_count"/></option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
				<option value="10">10</option>
			</select>
		</s:form>
<s:property value="amount"/>




		<!-- 小計 -->


		<!-- キャンセルボタン -->
		<s:form action="CartDeleteAction">

			<!-- ★item_id=1と設定中 -->
			<input type="hidden" name="item_id" value="1">
			<s:submit type="button" name="item_id" label="削除"/>
		</s:form>



		<!-- カートが空のとき、クレジットカード入力画面へ進もうとするとエラーメッセージを表示 -->


		<!-- 合計 -->
		<h1>合計</h1>
		合計：5000円<br><br><br><Br><Br>

		<!-- 購入を続ける画面へ遷移 -->

		<a href="main.jsp">買い物を続ける</a>



		<!-- 購入画面へ遷移 -->

		<a href="pay.jsp">購入手続きへ</a>





	</article>


</body>
</html>



