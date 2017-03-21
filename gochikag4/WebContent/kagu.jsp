<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
				<div class="searchBOX">
					<s:form action="ItemSearchAction">
						<s:textfield name="searchItem" />
						<select name="searchSort">
							<option value="1"><s:text name="安い順" /></option>
							<option value="2"><s:text name="高い順" /></option>
							<option value="3"><s:text name="古い順" /></option>
							<option value="4"><s:text name="新着順" /></option>
							<option value="5"><s:text name="￥0-￥2499" /></option>
							<option value="6"><s:text name="￥3000-￥5000" /></option>
						</select>
						<s:submit value="検索" />
					</s:form>
					</div>
	<s:iterator value="items">
		<s:iterator>
			<p><s:property value="itemName" /></p>
			<p><s:property value="price" /></p>
			<s:form action="ItemAction">
				<s:hidden name="itemId" value="%{itemId}" />
				<s:submit type="image" src="learn.jpg"/>
			</s:form>
		</s:iterator>
	</s:iterator>
</body>
</html>