function jump(){
	if(window.sessionStorage.length==0){
		location.href="top.jsp";
	}else{
		location.href="main.jsp";
	}
}


$(function(){
    $('.input-mail').change(function(){
    	if(!$(this).val().match(/^([a-zA-Z0-9])+([a-zA-Z0-9\._-])*@([a-zA-Z0-9_-])+([a-zA-Z0-9\._-]+)+$/)){
    		alert('有効なメールアドレスを入力してください。');
    	}
    });
});

$('form').submit(function(){
	var flag = true;
	var message = null;
	if($('.input-title').val() == "") {
		flag = false;
		message = "件名を入力してください。";
	}
	if($('.input-name').val() == "") {
		flag = false;
		message = "名前を入力してください。";
	}
	if($('.input-text').val() == ""){
		flag = false;
		message = "お問い合わせ内容を入力してください。";
	}
	if($('.input-mail').val() == ""){
		flag = false;
		message = "メールを入力してください。";
	}
	if(!flag){
		console.log("HERE");
		alert(message);
		return flag;
	}
	console.log("HERE2");
	return flag;
});