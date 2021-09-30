const person={
    name:"john",
    age:45,
    address:"madanapalli",
    state:"AP"
}
console.log(person.address);
let { name: orgname, address: orgAddress,address:zipcode} = {name: 'capgemini', address: 'madanapalli',address:'517325'};
console.log(orgAddress); 