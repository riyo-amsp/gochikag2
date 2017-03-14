<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>商品一覧</title>
</head>
<body>


	<s:iterator value="dtoList">
		<s:property value="itemName" />
		<s:property value="mainPicture" />
		<s:property value="mainPicture" />
		<s:property value="detailJa" />
	</s:iterator>
	<h1>sasaas</h1>

	<table>

		<tr>
			<th>商品名</th>
			<th>価格</th>
			<th>画像</th>

			<td><s:property value="itemName" /></td>
			<td><s:property value="mainPicture" /></td>
			<td><s:property value="mainPicture" /></td>
			<td><s:property value="detailJa" /></td>

			<td><s:iterator value="dtoList">
		<s:property value="itemName" />
		<s:property value="mainPicture" />
		<s:property value="mainPicture" />
		<s:property value="detailJa" />
	</s:iterator></td>
			</tr>

	</table>

<table>
  <caption>身近な果物</caption>
  <tr>
    <th>名称</th>
    <th>味の特徴</th>
    <th>色</th>
  </tr>
  <tr>
    <td>りんご</td>
    <td>甘酸っぱい</td>
    <td>おおむね赤</td>
  </tr>
  <tr>
    <td>なつみかん</td>
    <td>かなり酸っぱいと思う</td>
    <td>たいてい黄色</td>
  </tr>
</table>

</body>
</html>