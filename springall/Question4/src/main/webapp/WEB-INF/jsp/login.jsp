<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
function login(){
	var username=$("#username").val();
	var password=$("#password").val();
	var input={
			"username":username,
			"password":password

	}
	$.ajax({
		type:"get",
		url:"check_login",
		data:input,
		success:function(response){
			if(response=="success") {
				alert("Registration success");
				window.location.href = "success";
			}
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
<button type="submit" id="submit" onclick="login()">submit</button>
<a href="register">Register</a>
</body>
</html>
