<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/admin_item_list.css" />


<title>商品一覧</title>

</head>
<body>

<h1>商品更新画面</h1>

	<br>
	<br>
	<br>

	<form action="AdminControlAction">
		<table class="brwsr1" border="1">

			<tr>
				<th class="r1">商品名</th>
				<th class="r2">商品ID</th>
				<th class="r3">値段</th>
				<th class="r4">在庫</th>
				<th class="r5">商品画像</th>
				<th class="r6">詳細</th>
			</tr>
			<tr>
				<th class="r1"><s:property  value="nameList[0]" /></th>
				<th class="r2"><s:property value="itemIdList[0]" /></th>
				<th class="r3"><input type="number" name="price"
					placeholder="<s:property value="priceList[0]" />"></th>
				<th class="r4"><input type="number"
					placeholder="<s:property value="countList[0]" />"></th>
				<th class="r5"><input type="text"
					placeholder="<s:property value="mainPictureList[0]" />"></th>
				<th class="r6"><input type="text"
					placeholder="<s:property value="detailJaList[0]" />"></th>
				<td><input type="submit" value="更新"></td>
			</tr>
			<tr>
				<th class="r1"><s:property value="nameList[1]" /></th>
				<th class="r2"><s:property value="itemIdList[1]" /></th>
				<th class="r3"><input type="number" name="price"
					placeholder="<s:property value="priceList[1]" />"></th>
				<th class="r4"><input type="number" name="itemCount"
					placeholder="<s:property value="countList[1]" />"></th>
				<th class="r5"><input type="text" name="mainPicture"
					placeholder="<s:property value="mainPictureList[1]" />"></th>
				<th class="r6"><input type="text" name="detailJa"
					placeholder="<s:property value="detailJaList[1]" />"></th>
			</tr>
			<tr>
				<th class="r1"><s:property value="nameList[2]" /></th>
				<th class="r2"><s:property value="itemIdList[2]" /></th>
				<th class="r3"><input type="number" name="price"
					placeholder="<s:property value="priceList[2]" />"></th>
				<th class="r4"><input type="number" name="itemCount"
					placeholder="<s:property value="countList[2]" />"></th>
				<th class="r5"><input type="text" name="mainPicture"
					placeholder="<s:property value="mainPictureList[2]" />"></th>
				<th class="r6"><input type="text" name="detailJa"
					placeholder="<s:property value="detailJaList[2]" />"></th>
			</tr>
			<tr>
				<th class="r1"><s:property value="nameList[3]" /></th>
				<th class="r2"><s:property value="itemIdList[3]" /></th>
				<th class="r3"><input type="number" name="price"
					placeholder="<s:property value="priceList[3]" />"></th>
				<th class="r4"><input type="number" name="itemCount"
					placeholder="<s:property value="countList[3]" />"></th>
				<th class="r5"><input type="text" name="mainPicture"
					placeholder="<s:property value="mainPictureList[3]" />"></th>
				<th class="r6"><input type="text" name="detailJa"
					placeholder="<s:property value="detailJaList[3]" />"></th>
			</tr>
			<tr>
				<th class="r1"><s:property value="nameList[4]" /></th>
				<th class="r2"><s:property value="itemIdList[4]" /></th>
				<th class="r3"><input type="number" name="price"
					placeholder="<s:property value="priceList[4]" />"></th>
				<th class="r4"><input type="number" name="itemCount"
					placeholder="<s:property value="countList[4]" />"></th>
				<th class="r5"><input type="text" name="mainPicture"
					placeholder="<s:property value="mainPictureList[4]" />"></th>
				<th class="r6"><input type="text" name="detailJa"
					placeholder="<s:property value="detailJaList[4]" />"></th>
			</tr>
			<tr>
				<th class="r1"><s:property value="nameList[5]" /></th>
				<th class="r2"><s:property value="itemIdList[5]" /></th>
				<th class="r3"><input type="number" name="price"
					placeholder="<s:property value="priceList[5]" />"></th>
				<th class="r4"><input type="number" name="itemCount"
					placeholder="<s:property value="countList[5]" />"></th>
				<th class="r5"><input type="text" name="mainPicture"
					placeholder="<s:property value="mainPictureList[5]" />"></th>
				<th class="r6"><input type="text" name="detailJa"
					placeholder="<s:property value="detailJaList[5]" />"></th>
			</tr>

		</table>
	</form>
</body>
</html>