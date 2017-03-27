function jump(){
	if(window.sessionStorage.length==0){
		location.href="top.jsp";
	}else{
		location.href="main.jsp";
	}
}