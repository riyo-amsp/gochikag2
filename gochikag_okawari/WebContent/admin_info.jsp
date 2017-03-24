<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="property.adminInfo" var="lang" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
	<title><s:text name="lang.adminInfo.top"/></title>
	<!-- Bootstrap CSS -->
	<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<!-- jQuery JS -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<!-- Bootstrap JS -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<style>
		.table-header{
			margin : 20px auto ;
		}
		.table-wrapper{
			width : 80% ;
			margin : 0 auto ;
		}
	</style>
</head>
<body>
	<div align="center" class="table-header">
		<h1><s:text name="lang.adminInfo.heading"/></h1>
	</div>
	<div class="table-wrapper">
		<table class="table table-bordered">
			<tr>
				<th class="text-center">No.</th>
				<th class="text-center"><s:text name="lang.adminInfo.empty"/></th>
				<th class="text-center"><s:text name="lang.adminInfo.name"/></th>
				<th class="text-center"><s:text name="lang.adminInfo.show"/></th>
				<th class="text-center"><s:text name="lang.adminInfo.delete"/></th>
			</tr>

			<s:if test="infoList.size()!=0">
				<s:iterator value="infoList" status="aoi">

			<tr>
				<td class="text-center"><s:property value="#aoi.count"/>
				<td class="text-center"><s:property value="title"/></td>
				<td class="text-center"><s:property value="name"/></td>

				<td class="text-center"><button data-toggle="modal"
							data-target="#info-<s:property value="#aoi.count"/>"><s:text name="lang.adminInfo.show"/></button>

			<!-- modal -->
			<!-- class=modal →モーダルダイアログの範囲 -->
			<div class="modal" id="info-<s:property value="#aoi.count"/>">

				<!--  modal-dialog:ダイアログの書式決定（位置、サイズなど）-->
				<div class="modal-dialog">

					<!-- modal-content:ダイアログの書式設定（枠線、角丸、角など）-->
					<div class="modal-content">

						<!-- modal-header:ヘッダーの領域（省略可） -->
						<div class="modal-header">
							<button class="close" data-dismiss="modal">
								<span aria-hidden="true">&times;</span>
							</button>

							<!-- modal-title:見出し文字の余白や行間の設定 -->
							<h4 class="modal-title">
								<s:text name="lang.adminInfo.title"/> : <s:property value="title"/></h4>
						</div>

						<!-- modal-body:本文の領域 -->
						<div class="modal-body">
							<dl>
								<dt><s:text name="lang.adminInfo.name"/></dt>
									<dd><s:property value="name"/></dd>
								<dt><s:text name="lang.adminInfo.mail"/></dt>
									<dd><s:property value="mail"/></dd>
								<dt><s:text name="lang.adminInfo.info"/></dt>
									<dd><s:property value="info"/></dd>
							</dl>
						</div>

						<!-- modal-fotter:フッターの領域（省略可能） -->
						<div class="modal-footer">
							<p><s:property value="date"/></p>
							<button data-dismiss="modal"><s:text name="lang.adminInfo.close"/></button>
						</div>
					</div>
				</div>
			</div>
				</td>


				<td class="text-center">
						<form action="AdminInfoDeleteAction">
							<input type="hidden" name=mail value="<s:property value="mail"/>"/>
							<input type="hidden" name=date value="<s:property value="date"/>"/>
							<input type="submit" value="<s:text name="lang.adminInfo.delete"/>"/>
						</form>
				</td>

			</tr>
			</s:iterator>
		</s:if>

		</table>
	</div>
	
	<a href="admin.jsp"><s:text name="lang.adminInfo.admin"/></a>
		
</body>
</html>