var fib_generator=function *()
{
    var current = 0, next = 1;
  while(true)
  {
     [next, current] = [next+current, next];
     yield current;
  }
}

var fib = fib_generator();

for(var i = 0; i < 10; i++)
{
   console.log(fib.next().value);
}
