let name = ["Tesla", "Ferrari", "Lamborghini", "Audi"];
let length=[,,];
for(let i = 0; i < name.length; i++) 
{
  length[i]=name[i].length;
}
    let merge = (a1, a2) => name.map((n, i) => ({name: n, length:length[i]}));
    console.log(merge(name,length));
   




