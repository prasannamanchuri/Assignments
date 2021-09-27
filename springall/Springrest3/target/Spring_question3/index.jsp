<html>
<head>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	function submit() {
		var zipcode = $("#zipcode").val();
		$.ajax({
			url : "getUserDetails/"+zipcode,
			type : "POST",
			contentType : "application/json; charset=utf-8",
			success : function(response) {
				$("#user_details").html("details:" + response.zipcode);
			}
		})
	}
</script>
</head>
<body>
	<input type="text" name="a" id="zipcode" placeholder="enter zipcode" />

	<button type="submit" id="submit" onclick="submit()">submit</button>
	<div id="user_details"></div>
</body>
</html>
