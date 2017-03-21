<%@ page language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>支払い</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" />
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  	
  	<style>
  	.cover {
  		width: 700px;
  		clear: both;
  		text-align: center;
  		margin: 20px auto;
  	}
  	
  	.form-text{
  		width: 45%;
  		text-align: right;
  		float: left;
  	} 		  	
  	.cover1 .wwgrp {
  		width: 45%;
  		text-align: left;
  		display: inline-block;
  	}
  	
  	.choose-credit {
  		width: 45%;
  		display: inline-block;
  		text-align: left;
  	}
  	.choose-credit-text{
  		text-align: right;
  		float: left;
  	}
  	.choose-credit-select{
  		text-align: left;
  		width: 100px;
  	}
  	
  	.card-number{
  		float: left;
  		margin-right: 5px;
  	}
  	.card-number-text{
  		float: left;
  		text-align: right;
  		width: 45%;
  	}
  	.card-number-box{
		display: inline-block;
		margin: 0 auto;
  		width: 45%;
  	}
  	
  	.card-security-text{
  		float: left;
  		text-align: right;
  		width: 45%;
  	}
  	.card-security-number{
  		display: inline-block;
		margin: 0 auto;
  		width: 45%;
  	}
  	.card-security{
  		float: left;
  	}
  
  	</style>

</head>
<body>
	
	<s:form action="CreditConfirmAction">
		<div class="cover cover1">
			<p class="form-text">苗字:</p>
			<s:textfield name="lastName" size ="10" maxlength="10" cssClass="lastName" theme="css_xhtml"/>
		</div>
		<div class="cover cover1">
			<p class="form-text">名前:</p>
			<s:textfield name="firstName" size="10" maxlength="10" cssClass="firstName" theme="css_xhtml"/>
		</div>
		
		<div class="cover">
			<p class="choose-credit choose-credit-text">クレジットカード選択:</p>
			<div class="choose-credit">
				<select name="cardBrand" class="choose-credit-select">
					<option value="visa">Visa</option>
					<option value="master">Master</option>
					<option value="amex">American Express</option>
				</select>
			</div>
    	</div>
		
		<div class="cover">
			<p class="card-number-text">クレジット番号:</p>
			<div class="card-number-box">
				<s:textfield name="creditNumber1" placeholder="0000" size ="4" maxlength='4' cssClass="card-number card-number-1" theme="css_xhtml"/>
				<s:textfield name="creditNumber2" placeholder="0000" size ="4" maxlength='4' cssClass="card-number card-number-2" theme="css_xhtml"/>
				<s:textfield name="creditNumber3" placeholder="0000" size ="4" maxlength='4' cssClass="card-number card-number-3" theme="css_xhtml"/>
				<s:textfield name="creditNumber4" placeholder="0000" size ="4" maxlength='4' cssClass="card-number card-number-4" theme="css_xhtml"/>
			</div>
		</div>
		
		<div class="cover">
			<p class="card-security-text">セキュリティ番号</p>
			<div class="card-security-number">
				<s:textfield name="securityCode" placeholder="000" size="3" maxlength="3" cssClass="card-security" theme="css_xhtml"/>
			</div>
		</div>
		
		<div class="cover">
			<p class="card-expiration-text">クレジットカード有効期限</p>
			<div class="card-expiration-box">
				<select name="expirationYear" class="card-expiration">
					<option value="2017">2017</option>
					<option value="2018">2018</option>
					<option value="2019">2019</option>
					<option value="2020">2020</option>
				</select>
				<select name="expirationMonth" class="card-expiration">
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
	 		<s:submit value="次へ" />
	 	</div>
	</s:form>

<!-- ここからJavaScriptだよ -->
<script>
	$(function(){
	    $('.lastName').change(function(){
	        if(!$(this).val().match(/[A-Z]{1,10}/)){
	          alert('入力が違います');
	          $(this).val('');
	        }
	      });
	    
	    $('.firstName').change(function(){
	        if(!$(this).val().match(/^[A-Z]{1,10}$/)){
	          alert('入力が違います');
	          $(this).val('');
	        }
	      });
	    
	    $('.choose-credit-select').change(function(){
	    	console.log($(this).val());
	    	console.log($(this).val() == "amex");
	    	if($(this).val() == "master" || $(this).val() == "visa" ){
	            $('.card-number-4').show();
	            $('.card-number-2').attr({'maxlength': '4', 'size':'4', 'placeholder': '0000'}).removeClass('amexSelected');
	            $('.card-number-3').attr({'maxlength': '4', 'size':'4', 'placeholder': '0000'}).removeClass('amexSelected');
	            $('.card-security').attr({'placeholder': '000','size': '3','maxlength': '3'});
	    	}
	    	if($(this).val() == "amex"){
	            $('.card-number-4').hide();
	            $('.card-number-2').attr({'maxlength': '6', 'size':'6', 'placeholder': '000000'}).addClass('amexSelected');
	            $('.card-number-3').attr({'maxlength': '5', 'size':'5', 'placeholder': '000000'}).addClass('amexSelected');
	            $('.card-security').attr({'placeholder': '0000','size': '4','maxlength': '4'});
	    	}
	    });
		
	});


</script>	

</body>
</html>