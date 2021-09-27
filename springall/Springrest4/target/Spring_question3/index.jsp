<html>
<head>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
	function submit() {
		
		var cardtype = $("#cardType").val();
		var cardNo = $("#cardno").val();
		$.ajax({
			url : "getUserDetails/"+zipcode,
			type : "POST",
			data:{"cardType":cardtype,"cardNo":cardNo},
			contentType : "application/json; charset=utf-8",
			success : function(response) {
				$("#user_details").html("{'state':'"+response.State+"','city':'"+response.City+"','country':'"+response.Country+"'}");
			}
		})
	}
</script>
</head>
<body>
<label for="cardtype">Choose a card type:</label>
  <select name="cardType" id="card">
    <option value="Discover">Discover</option>
    <option value="Master">Master</option>
    <option value="Visa">Visa</option>
 </select>
	<input type="text" name="a" id="cardno" placeholder="enter cardno" />

	<button type="submit" id="submit" onclick="submit()">submit</button>
	<div id="user_details"></div>
</body>
</html>
