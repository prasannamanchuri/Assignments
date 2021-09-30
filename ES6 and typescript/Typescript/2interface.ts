interface Printable { 
 print: ()=>string 
 } 
 
 var circle:Printable = { 
    
    print: ():string =>{return "draw circle"} 
 } 
 
 console.log("Circle Object ") 
 
 console.log(circle.print())  
 
 var employee:Printable = { 
    
    print: ():string =>{return "Hello!!!"} 
 } 
   
 console.log("Employee  Object ")
 console.log(employee.print())  
 