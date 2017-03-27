$(function(){
    $('.item-name').change(function(){
        if(!$(this).val().match(/^[A-Z]{1,10}$/)){
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
    
    $('.card-number-1').change(function(){
    	var length = $(this).attr('maxlength');
    	var regExp = "[0-9]{" + length + "}";
    	reg = new RegExp(regExp);   	
        if(!$(this).val().match(reg)){
          alert('入力が違います');
          $(this).val('');
        }
    });
    $('.card-number-2').change(function(){
    	var length = $(this).attr('maxlength');
    	var regExp = "[0-9]{" + length + "}";
    	reg = new RegExp(regExp);   	
        if(!$(this).val().match(reg)){
          alert('入力が違います');
          $(this).val('');
        }
    });
    $('.card-number-3').change(function(){
    	var length = $(this).attr('maxlength');
    	var regExp = "[0-9]{" + length + "}";
    	reg = new RegExp(regExp);   	
        if(!$(this).val().match(reg)){
          alert('入力が違います');
          $(this).val('');
        }
    });
    $('.card-number-4').change(function(){
    	var length = $(this).attr('maxlength');
    	var regExp = "[0-9]{" + length + "}";
    	reg = new RegExp(regExp);   	
        if(!$(this).val().match(reg)){
          alert('入力が違います');
          $(this).val('');
        }
    });
    $('.card-security').change(function(){
    	var length = $(this).attr('maxlength');
    	var regExp = "[0-9]{" + length + "}";
    	reg = new RegExp(regExp);   	
        if(!$(this).val().match(reg)){
          alert('入力が違います');
          $(this).val('');
        }
    });
    
    $('form').submit(function(){
    	var flag = true;
    	var message = null;
    	if($('.item-name').val() == "") {
    		flag = false;
    		message = "アイテム名を入力してください";
    	}
    	if($('.price').val() == "") {
    		flag = false;
    		message = "値段を入力してください";
    	}
    	if($('.stock-number').val() == ""){
    		flag = false;
    		message = "在庫数を入力してください";
    	}
    	if($('.main-picture').val() == ""){
    		flag = false;
    		message = "写真のパス名を入力してください";
    	}
    	if($('.sub-picture1').val() == ""){
    		flag = false;
    		message = "サブ写真1のパス名を入力してください";
    	}
    	if($('.sub-picture2').val() == ""){
    		flag = false;
    		message = "サブ写真2のパス名を入力してください";
    	}
    	if($('.sub-picture1').val() == ""){
    		flag = false;
    		message = "サブ写真3のパス名を入力してください";
    	}
    	if($('.detail-ja').val() == ""){
    		flag = false;
    		message = "日本語の商品説明を入力してください";
    	}
    	if($('.detail-en').val() == ""){
    		flag = false;
    		message = "英語の商品説明を入力してください";
    	}
 
    	if(!flag){
    		alert(message);
    		return flag;
    	}
    	return flag;
    });
});