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

	submit_btn {
		display:inline-block;
	}
	</style>


	<body>

		<article>

		<!-- ★ためしはじめカートリスト：消す -->
				<!-- カートリスト -->
		<h1>カートリスト①</h1>
		<table border="1">

			<!--  カラム名 -->
			<tr>
				<td>アイテム名</td>
				<td>単価(円)</td>
				<td>数量</td>
				<td>小計</td>
				<td>削除</td>
			</tr>

			<!-- データ -->
			<tr>
				<s:form action="CartUpdateAction">
					<s:hidden name="price" value="2500"/>
					<s:hidden name="itemName" value="table1"/>
					<s:hidden name="amount" value="2500"/>
					<!-- アイテム名 -->
					<td>テーブル</td>

					<!-- 単価 -->
					<td>20</td>

					<!--  数量選択ボタン -->
					<input type="hidden" name="itemId" value="1"/>

					<td style="display:inline-block;">
						<select name="itemCount" onChange="this.form.submit()">
						<!-- 数量選択し、action後は、設定した数量を表示 -->
							<option value="<s:property value="1"/>" selected>
								<s:property value="itemCount"/>
							</option>
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
						</select>
					</td>
					<!-- 小計 -->
					<td>20</td>
				</s:form>


				<s:form action="CartDeleteAction">
					<!-- 削除ボタン -->
					<s:hidden name="itemId" value="1" cssClass="submit_btn" theme="css_xhtml"/>
					<s:hidden name="userId" value="%{#session.id}"/>
					<td>
						<!-- ★item_id=1と設定中 -->
						<s:submit value="削除" cssClass="submit_btn" theme="css_xhtml"/>
					</td>
				</s:form>
			</tr>
		</table>



		<!-- 本ちゃん：カートリスト -->
		<h1>カートリスト</h1>
		<table border="1">

			<!--  カラム名 -->
			<tr>
				<td>アイテム名</td>
				<td>単価(円)</td>
				<td>数量</td>
				<td>小計</td>
				<td>削除</td>
			</tr>

			<!-- データ -->
			<tr>
				<s:iterator value="itemList">

					<s:iterator>

						<p><s:property value="itemName"/></p>
						<p><s:property value="price"/></p>


						<s:form action="CartUpdateAction">

						<!-- アイテム名 -->
						<td><s:property value="itemName"/></td>

						<!-- 単価 -->
						<td><s:property value="price"/></td>

						<!--  数量選択ボタン -->
						<td>
							<select name="itemCount" onChange="this.form.submit()">

							<!-- 数量選択し、action後は、設定した数量を表示 -->
							<option value="<s:property value="itemCount"/>" selected>
							<s:property value="itemCount"/></option>
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
						</td>



						<!-- 小計 -->

						<td><s:property value="amount"/></td>
						<s:hidden name="itemId" value="%{itemId}"></s:hidden>
						</s:form>


						<!-- 削除ボタン -->
						<td>
							<s:form action="CartDeleteAction">

								<!-- ★item_id -->
								<s:hidden name="itemId" value="%{itemId}"/>
								<s:submit type="button" label="削除"/>
							</s:form>
						</td>

				</s:iterator>

			</s:iterator>

		</tr>
	</table>












		<!-- 小計 -->






		<!-- カートが空のとき、クレジットカード入力画面へ進もうとするとエラーメッセージを表示 -->


		<!-- 合計 -->
		<h1>合計</h1>
		合計：<s:property value="totalPrice"/><br><br><br><Br><Br>

		<!-- 購入を続ける画面へ遷移 -->

		<a href="main.jsp">買い物を続ける</a>



		<!-- 購入画面へ遷移 -->

		<a href="pay.jsp">購入手続きへ</a>





	</article>


</body>
</html>

