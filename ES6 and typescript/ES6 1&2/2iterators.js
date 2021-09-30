const isArmstrong = number => {
  let num = number;
  const len = String(num).split("").length;
  let res = 0;
  while(num){
     const last = num % 10;
     res += Math.pow(last, len);
     num = Math.floor(num / 10);
  };
  return res === number;
};
const nextarmstrong = (lower, upper) => {
  const res = [];
  for(let i = lower; i <= upper; i++){
     if(isArmstrong(i)){
        res.push(i);
     };
  };
  return res;
};
console.log(nextarmstrong(1, 400));