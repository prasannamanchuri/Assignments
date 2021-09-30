class order
{ 
constructor(id,title,price)
    {
        this.id=id;
        this.title=title;
        this.price=price;
    }
    getprice()
    {
    console.log(this.price);
    }
  printorder()
  {
      console.log(obj);
  }
}
let obj=new order(1,"soap",50);
obj.getprice();
obj.printorder();
const new_obj = Object.assign({}, obj);
console.log(new_obj);
