const compose = (...fns) => x => fns.reduceRight((y, f) => f(y), x); //mentioning the order of executuion of functions
const double = x => x * 2
const square = x => x * x

// function composition
var output_final = compose(square, double)(10);
document.write(output_final);
