<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
function calculateSI(){
	var principal=$("#principal").val();
	var timeperiod=$("#timeperiod").val();
	var roi=$("#rate_of_intrest").val();
	var input={
			"principal":principal,
			"timeperiod":timeperiod,
			"roi":roi
	}
	$.ajax({
		type:"get",
		url:"calculate",
		data:input,
		success:function(response){
			$("#si_resp").html("Simple Interst is"+response);
		}
	})
}
</script>
</head>
<body>
<input type="text" name="a" id="principal" placeholder="enter principal amount"/>
<input type="text" name="b" id="timeperiod" placeholder="enter timeperiod"/>
<input type="text" name="c" id="rate_of_intrest" placeholder="enter rate of intrest"/>
<button type="submit" id="calculate SI" onclick="calculateSI()">calculate SI</button>
<div id="si_resp"></div>
</body>
</html>
