<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
function register(){
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
		url:"registration",
		data:input,
		success:function(response){
			if(response=="success")
				window.location.href = "login";
			else
				window.location.href = "error";
		}
	})
}
</script>
</head>
<body>
<input type="text" name="a" id="username" placeholder="enter username"/><br/><br/>
<input type="text" name="b" id="password" placeholder="enter password"/><br/><br/>
<input type="email" name="c" id="email" placeholder="enter emailid"/><br/><br/>
<button type="submit" id="submit" onclick="register()">Register</button>
<a href="login">Login</a>
</body>
</html>
