// rest with function and other arguments
function fun(username,...friends){
	console.log("uername:"+`${username}`+"   "+"friends are :"+friends); 
	
}
fun('Mukul','Latiyan','Lionel','Messi','Barcelona');
var x = [ 'Ali', 'Atta', 'Alex', 'John']; 
uppercase(x);
function uppercase(params) {
  for (i=0; i<params.length; i++) {
  var uppercased = x.map(x=>x.toUpperCase());
  }
  console.log(uppercased);
}