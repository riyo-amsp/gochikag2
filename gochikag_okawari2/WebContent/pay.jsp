<%@ page language="java"
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	
	<fmt:setLocale value="${pageContext.request.locale.language}" />
	<fmt:setBundle basename="com.internousdev.gochikag.property.pay" var="lang" />
	
	<title><s:text name="lang.pay.PaymentPage" /></title>
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  	
  	<link rel="stylesheet" type="text/css" href="css/pay.css">
</head>
<body>
	<div align="center">
		<h1><s:text name="lang.pay.PayIsACreditCard" /></h1>
	</div>

	<s:if test="errorValue == 1">
		<div class="error-message">
			<h5><s:text name="lang.pay.Error1" /></h5>
			<h5><s:text name="lang.pay.Error" /></h5>
		</div>
	</s:if>
	<s:elseif test="errorValue == 2">
		<div class="error-message">
			<h5><s:text name="lang.pay.Error2" /></h5>
			<h5><s:text name="lang.pay.Error" /></h5>
		</div>
	</s:elseif>
	<s:elseif test="errorValue == 3">
		<div class="error-message">
			<h5><s:text name="lang.pay.Error3" /></h5>
			<h5><s:text name="lang.pay.Error" /></h5>
		</div>
	</s:elseif>
	<s:elseif test="errorValue == 4">
		<div class="error-message">
			<h5><s:text name="lang.pay.Error4" /></h5>
			<h5><s:text name="lang.pay.Error" /></h5>
		</div>
	</s:elseif>
	

	<s:form action="CreditConfirmAction">
		<div class="cover cover1">
			<p class="form-text"><s:text name="lang.pay.FirstName" />:</p>
			<s:textfield name="firstName" size="10" maxlength="10" cssClass="firstName" theme="css_xhtml" placeholder="TARO"/>
		</div>
		<div class="cover cover1">
			<p class="form-text"><s:text name="lang.pay.LastName" />:</p>
			<s:textfield name="lastName" size ="10" maxlength="10" cssClass="lastName" theme="css_xhtml" placeholder="TANAKA"/>
		</div>

		<div class="cover">
			<p class="choose-credit choose-credit-text"><s:text name="lang.pay.SelectCreditCard" />:</p>
			<div class="choose-credit">
				<select name="cardBrand" class="choose-credit-select">
					<option value="visa">Visa</option>
					<option value="master">Master</option>
					<option value="amex">American Express</option>
				</select>
			</div>
    	</div>

		<div class="cover">
			<p class="card-number-text"><s:text name="lang.pay.CardNumber" />:</p>
			<div class="card-number-box">
				<s:textfield name="creditNumber1" placeholder="0000" size ="4" maxlength='4' cssClass="card-number card-number-1" theme="css_xhtml"/>
				<s:textfield name="creditNumber2" placeholder="0000" size ="4" maxlength='4' cssClass="card-number card-number-2" theme="css_xhtml"/>
				<s:textfield name="creditNumber3" placeholder="0000" size ="4" maxlength='4' cssClass="card-number card-number-3" theme="css_xhtml"/>
				<s:textfield name="creditNumber4" placeholder="0000" size ="4" maxlength='4' cssClass="card-number card-number-4" theme="css_xhtml"/>
			</div>
		</div>

		<div class="cover">
			<p class="card-security-text"><s:text name="lang.pay.SecurityNumber" /></p>
			<div class="card-security-number">
				<s:textfield name="securityCode" placeholder="000" size="3" maxlength="3" cssClass="card-security" theme="css_xhtml"/>
			</div>
		</div>

		<div class="cover">
			<p class="card-expiration-text"><s:text name="lang.pay.CardExpiration" /></p>
			<div class="card-expiration-box">
				<s:select list="years" name="expirationYear" cssClass="card-expiration-year" theme="css_xhtml"/>
				
				<select name="expirationMonth" class="card-expiration-month">
					<option value="01">1</option>
					<option value="02">2</option>
					<option value="03">3</option>
					<option value="04">4</option>
					<option value="05">5</option>
					<option value="06">6</option>
					<option value="07">7</option>
					<option value="08">8</option>
					<option value="09">9</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
				</select>
			</div>
		</div>
		<div class="cover">
	 		<input type="submit" value=<s:text name="lang.pay.Next" /> class="form-control submit"/>
	 	</div>
	</s:form>

	<script src="js/pay.js"></script>
</body>
</html>