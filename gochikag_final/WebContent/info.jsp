<%@ page language="java"
	contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title><s:text name="lang.info.Contact"/></title>
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
	<s:if test="%{#session.id != 0}">
		<s:include value="header_done.jsp" />
	</s:if>
	<s:else>
		<s:include value="header.jsp" />
	</s:else>


	<s:form action="InfoAction">
		<>
			<div class="contents">
				<h1><s:text name="lang.info.contact"/></h1>
					<div class="form-group">
					<label for ="name"><s:text name="lang.info.name"/></label>
					<input type="text" name="name"  placeholder ="name" class="form-control"/>
					</div>
					<div class="form-group">
					<label for ="email"><s:text name="lang.info.email"/></label>
					<input type="text" name="email" placeholder="email" class="form-control"/>
					</div>
					<div class="form-group">
					<label for="info"><s:text name="lang.info.info"/></label>
					<input type="text"  name="info" size="45"  placeholder="infomation" class="form-control"/>
					</div>
			</div>
			<button type="submit" class="form-control" ><s:text name="lang.info.submit"/></button>
	</s:form>

	<s:property value="name"/>
	<s:property value="email"/>
	<s:property value="info"/>



</body>
</html>