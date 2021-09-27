<html>
<head>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.min.js"
	integrity="sha384-skAcpIdS7UcVUC05LJ9Dxay8AXcDYfBJqt1CJ85S/CFujBsIzCIv+l9liuYLaMQ/"
	crossorigin="anonymous"></script>
<link href="//cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css"
	rel="stylesheet">
<script src="//cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
<script>
	$(document).ready(function() {
		list();
	});
	function add() {
		var emp = {
			"employeename" : $("#employeeName").val(),
			"employeedisgnation" : $("#employeeDesignation").val(),
			"employeesalary" : $("#employeeSalary").val()
		};
		$.ajax({
			type : "post",
			url : "add_employee",
			data : emp,
			success : function(response) {
				console.log(response);
			}
		})
	}
	function list() {
		$("#employeeDiv").html("");
		$.ajax({
			type : "get",
			contentType: "application/json",
			url : "list_employee",
			success : function(response) {
				console.log(response);
				alert(response);
			}
		})
	}
</script>
</head>
<body>
	<input type="text" id="employeeName" />
	<input type="text" id="employeeDesignation" />
	<input type="text" id="employeeSalary" />
	<button type="submit" id="submit" onclick="add()">Add</button>
	<div id="employeeDiv"></div>
</body>
</html>
