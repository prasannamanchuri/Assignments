const x = 42;
const y = 42;
const promise1 = Promise.resolve(x+y);


Promise.all([x,y,promise1]).then((values) => {
  console.log(values);
});