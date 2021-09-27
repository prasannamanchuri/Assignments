<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
function submit(){
	var username=$("#username").val();
	var password=$("#password").val();
	var email=$("#email").val();
	var input={
			"username":username,
			"password":password,
			"email":email
	}
	$.ajax({
		type:"get",
		url:"submit",
		data:input,
		success:function(response){
			$("#login_verify").html("login is"+response);
		}
	})
}
</script>
</head>
<body>
<input type="text" name="a" id="username" placeholder="enter username"/>
<input type="text" name="b" id="password" placeholder="enter password"/>
<input type="email" name="c" id="email" placeholder="enter emailid"/>
<button type="submit" id="submit" onclick="submit()">submit</button>
<div id="login_verify"></div>
</body>
</html>
