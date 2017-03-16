<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	  	<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>＊カート画面＊</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>


	<!-- ファビコンです　米島 -->

<link rel="shortcut icon" href="img/favcon.ico">



	</head>
	<style>
		body{
			text-align: center;
	  		background-color:  #F9F8F4;
	  		list-style: none;
	  	}
		submit_btn {
			display:inline-block;
		}
		.container{
			width: 600px;
		}
		ul {
			claer: both;
		}
		li {
			width: 100px;
			height: 100px;
			list-style: none;
			text-align: center;
			float: left;
			padding: 25px;
			margin: 0 auto;
		}
		.styleManage1{
			float: left;
			text-align: center;
		}
		.styleManage2{
			display: inline-block;
			margin: auto 0;
			align: center;
		}

		table{
			display: none;
		}
	</style>
	<script>
		$(function(){
			$('.add').children('div').attr('align', 'center');
		})
	</script>
	<body>
		<s:if test="%{#session.id != null}">
			<s:include value="header_done.jsp" />
		</s:if>
		<s:else>
			<s:include value="header.jsp" />
		</s:else>

		<!-- 本ちゃん：カートリスト -->
		<div class="container">
			<ul>
				<!--  カラム名 -->
					<li>アイテム名</li>
					<li>単価(円)</li>
					<li>数量</li>
					<li>小計</li>
					<li>削除</li>
			</ul>
		</div>
			<!-- データ -->
		<s:iterator value="itemList">
			<s:iterator>
				<div class="container">
					<ul>
						<s:form action="CartUpdateAction">
						<!--  パラメーターの送信: params = itemId, price, amount-->
							<s:hidden name="itemId" value="%{itemId}" />
							<s:hidden name="price" value="%{price}" />
							<s:hidden name="amount" value="%{amount}" />
						<!-- アイテム名 -->
							<li><s:property value="itemName"/> | </li>
						<!-- 単価 -->
							<li><s:property value="price"/> | </li>
						<!--  数量選択ボタン -->
							<li class="styleManage1">
								<s:select name="itemCount"
										  list="%{itemStockList.get(index)}"
										  onChange="this.form.submit()"
										  cssClass="styleManage2" theme="css_xhtml"/>
							</li>
						<!-- 小計 -->
							<li><s:property value="amount"/> | </li>
						</s:form>

						<!-- 削除ボタン -->
						<s:form action="CartDeleteAction">
							<!-- ★item_id -->
							<s:hidden name="itemId" value="%{itemId}"/>
							<li class="styleManage1">
								<s:submit type="button" label="削除"
										  cssClass="styleManage2" theme="css_xhtml"/>
							</li>
						</s:form>
					</ul>
				</div>
			</s:iterator>
		</s:iterator>
		<div class="container">
			<h1>合計 ：<s:property value="totalPrice"/></h1>

			<!-- 購入を続ける画面へ遷移 -->
			<a href="main.jsp">買い物を続ける</a>

			<!-- 購入画面へ遷移 -->
			<!-- カートが空のとき、クレジットカード入力画面へ進もうとするとエラーメッセージを表示 -->
			<s:if test="{!itemList.isEmpty()}" >
				<a href="pay.jsp">購入手続きへ</a>
			</s:if>
		</div>

</body>
</html>