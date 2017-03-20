<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/item_list.css" />


<title>商品一覧</title>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</head>
<body>

	<h1>商品更新画面</h1>

	<br>
	<br>
	<br>



	<table class="brwsr1" border="1">

		<tr>
			<th class="r1">商品名</th>
			<th class="r2">商品ID</th>
			<th class="r3">画像</th>
			<th class="r4">詳細</th>
			<th class="r5">在庫数</th>
			<th class="r6">価格</th>
		</tr>
		<s:iterator value="dtoList">
			<s:form action="AdminItemControlAction">
				<tr>
					<th class="r1"><s:property value="itemName" /></th>
					<td class="r2"><s:hidden name="itemId"><s:property value="itemId" /></s:hidden></td>
					<td class="r3"><s:property value="mainPicture" /></td>
					<td class="r4"><s:property value="detailJa" />"></td>
					<td class="r5"><input type="number" step="100" min="100"
						max="1000000" name="stockNumber"
						placeholder="<s:property value="stockNumber" />"></td>
					<td class="r6"><input type="number" step="100" min="100"
						max="1000000" name="price"
						placeholder="<s:property value="price" />"></td>

					<td class="r1"><button class="btn btn-primary">更新</button>
					<td>
				</tr>
			</s:form>
		</s:iterator>
	</table>


	<!-- モーダルウィンドウを呼び出すボタン -->
	<button type="button" class="btn btn-primary" data-toggle="modal"
		data-target="#myModal">削除</button>

	<!-- モーダルウィンドウの中身 -->
	<div class="modal fade" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title"></h4>
				</div>
				<div class="modal-body">削除してもよろしいですか？</div>
				<div class="modal-footer">
				<s:form action="adminItemDeleteAction">
								<p hidden>
									<input type="text" value="<s:property value="itemId"/>"
										readonly name="itemId">
								</p>
								<p align="center">
									<button type="submit" class="btn btn-large btn-danger">削除</button>
									<button type="button" class="btn btn-primary"
										data-dismiss="modal">cancel</button>
								</p>
							</s:form>
					<button type="button" class="btn btn-primary" data-dismiss="modal">閉じる</button>
				</div>
			</div>
		</div>
	</div>

</body>
</html>