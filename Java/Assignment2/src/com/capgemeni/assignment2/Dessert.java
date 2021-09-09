package com.capgemeni.assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

abstract class DessertItem {
	public abstract double getCost();

}

class Candy extends DessertItem {
	public double dollarCurrency = 2;

	@Override
	public double getCost() {
		return dollarCurrency;
	}

}

class Cookie extends DessertItem {
	public double euroCurrency = 4;

	@Override
	public double getCost() {
		return euroCurrency;
	}

}

class Icecream extends DessertItem {
	public double ruppeeCurrency = 50;

	@Override
	public double getCost() {
		return ruppeeCurrency;
	}

}

class DesserShop {
	private String itemName;
	private double itemCost;
	private int quantity;

	public DesserShop(String itemName, double itemCost, int quantity) {
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.quantity = quantity;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "DesserShop [itemName=" + itemName + ", itemCost=" + itemCost + ", quantity=" + quantity + "]";
	}
	
	public DesserShop() {}
	
}

public class Dessert {
	public static void main(String a[]) {
		List<DesserShop> desList=new ArrayList<DesserShop>();
		Scanner sc = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("Select RoleType: 1)Owner 2)Customer 3)Exit");
			int roleType = sc.nextInt();
			if (roleType == 1) {
				boolean flag1=true;
				while(flag1) {
					System.out.println("Add Items : 1)Candy, 2)Cookie, 3)IceCream 4)Exit");
					int n = sc.nextInt(),quantity=0;
					if(n<4) {
						System.out.println("Enter Quantity");
						quantity=sc.nextInt();
					}
					switch (n) {
					case 1:
						DessertItem dess = new Candy();
						desList.add(new DesserShop("Candy", dess.getCost(), quantity));
						break;
					case 2:
						dess = new Cookie();
						desList.add(new DesserShop("Cookie", dess.getCost(), quantity));
						break;
					case 3:
						dess = new Icecream();
						desList.add(new DesserShop("IceCream", dess.getCost(), quantity));
						break;
					case 4:
						flag1=false;
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + n);
					}
				}
			} else if (roleType == 2) {
				System.out.println("List of Desser Items....");
				for(DesserShop d:desList) {
					System.out.println("Item Name->"+d.getItemName()+"Cost->"+d.getItemCost()+",Quantity->"+d.getQuantity());
				}
				List<DesserShop> cartItems=new ArrayList<DesserShop>();
				boolean flag1=true;
				while(flag1) {
					System.out.println("Items : 1)Candy, 2)Cookie, 3)IceCream 4)Total Cart Price 5)Exit");
					int n = sc.nextInt(),quantity=0;
					if(n<4) {
						System.out.println("Enter Quantity");
						quantity=sc.nextInt();
					}
					Map<String,Object> map=new HashMap<>();
					switch (n) {
					case 1:
						map=addCart(desList, "Candy", quantity,cartItems);
						break;
					case 2:
						addCart(desList, "Cookie", quantity,cartItems);
						break;
					case 3:
						addCart(desList, "IceCream", quantity,cartItems);
						break;
					case 4:
						int totlAmount=0;
						for(DesserShop d:cartItems) {
							System.out.println(d.getItemName()+"->"+d.getItemCost()+"->"+d.getQuantity());
							if(d.getItemName().equalsIgnoreCase("Candy"))
								totlAmount+=d.getQuantity()*d.getItemCost()*60;
							else if(d.getItemName().equalsIgnoreCase("Cookie"))
								totlAmount+=d.getQuantity()*d.getItemCost()*70;
							else if(d.getItemName().equalsIgnoreCase("Icecream"))
								totlAmount+=d.getQuantity()*d.getItemCost();
						}
						System.out.println("Total Price..."+totlAmount);
						break;
					case 5:
						flag1=false;
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + n);
					}
					if(n<4) {
						if(map.containsKey("Error"))
							System.out.println("Unable to add to Cart, Error is -> "+map.get("Error"));
						else  {
							desList=(List<DesserShop>)map.get("list");
							DesserShop cItem=(DesserShop)map.get("cartItem");
							if(cartItems.size()>0) {
								boolean flag2=false;
							for(DesserShop ds:cartItems) {
								if(ds.getItemName().equalsIgnoreCase(cItem.getItemName())) {
									ds.setQuantity(ds.getQuantity()+cItem.getQuantity());
									flag2=true;
								}
							}
							if(!flag2)
								cartItems.add(cItem);
							} else {
								cartItems.add(cItem);
							}
							System.out.println(cartItems);
						}
					}
				}
			} else
				flag=false;
		}
		
	}
	
	public static Map<String,Object> addCart(List<DesserShop> desList,String item, int quantity,List<DesserShop> carItems) {
		Map<String,Object> result=new HashMap<>();
		List<DesserShop> filteredList=new ArrayList<DesserShop>();
		DesserShop cartshpitem=new DesserShop();
		for(DesserShop d:desList) {
			DesserShop ds=new DesserShop();
			if(d.getItemName().equalsIgnoreCase(item)) {
				if(d.getQuantity()>=quantity) {
					ds.setItemName(item);
					ds.setItemCost(d.getItemCost());
					ds.setQuantity(Math.abs(d.getQuantity()-quantity));
					cartshpitem.setItemName(item);
					cartshpitem.setItemCost(d.getItemCost());
					cartshpitem.setQuantity(quantity);
					filteredList.add(ds);
				}
				else {
					result.put("Error", "Selected Quantity is more than the quantity in Shop");
					return result;
				}
			}
			else
				filteredList.add(d);
		}
		if(filteredList.size()>0) {
			result.put("list", filteredList);
			result.put("cartItem", cartshpitem);
		}
		return result;
	}
}
