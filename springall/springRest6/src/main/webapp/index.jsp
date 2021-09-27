<html>
<head>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
function operation(type){
	var num1=$("#num1").val();
	var num2=$("#num2").val();
	
	var input={
			"num1":num1,
			"num2":num2,
			"type":type
	}
	$.ajax({
		type:"post",
		url:"operation",
		data:input,
		success:function(response){
			$("#resp").html("result is"+response);
		}
	})
	
}

</script>
</head>
<body>
<input type="text" name="a" id="num1" placeholder="enter first number"/>
<input type="text" name="b" id="num2" placeholder="enter second number"/><br>
<button type="button" id="add" onclick="operation('add')">Add</button>
<button type="button" onclick="operation('sub')">Sub</button>
<button type="button" onclick="operation('multiply')">Multiply</button>
<button type="button" onclick="operation('division')">Division</button>

<div id="resp"></div>


</body>
</html>
