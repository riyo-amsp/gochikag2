<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<link
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	rel="stylesheet">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

<title>商品検索</title>
</head>
<body>

	<s:form action="AdminItemListAction">
		<select class="parent" name="category">
			<option value="" selected="selected">カテゴリーを選択</option>
			<option value="kagu">家具</option>
			<option value="kaden">家電</option>
			<option value="sale">セール</option>
		</select>
		<button class="btn btn-success">検索</button>
	</s:form>

	<select class="children" name="category" disabled>
		<option value="" selected="selected">都道府県を選択</option>
		<option value="北海道" data-val="kagu">北海道</option>
		<option value="青森県" data-val="kaden">青森県</option>
		<s:iterator value="nameList">
		<option value="岩手県" data-val="sale">岩手県</option>
		<option value="神奈川県" data-val="sale"><s:property
				value="itemName" /></option>
				</s:iterator>

	</select>

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





	<script>
		var $children = $('.children'); //都道府県の要素を変数に入れます。
		var original = $children.html(); //後のイベントで、不要なoption要素を削除するため、オリジナルをとっておく

		//地方側のselect要素が変更になるとイベントが発生
		$('.parent').change(function() {

			//選択された地方のvalueを取得し変数に入れる
			var val1 = $(this).val();

			//削除された要素をもとに戻すため.html(original)を入れておく
			$children.html(original).find('option').each(function() {
				var val2 = $(this).data('val'); //data-valの値を取得

				//valueと異なるdata-valを持つ要素を削除
				if (val1 != val2) {
					$(this).not(':first-child').remove();
				}

			});

			//地方側のselect要素が未選択の場合、都道府県をdisabledにする
			if ($(this).val() == "") {
				$children.attr('disabled', 'disabled');
			} else {
				$children.removeAttr('disabled');
			}

		});
	</script>

</body>

</html>