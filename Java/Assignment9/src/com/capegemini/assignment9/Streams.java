package com.capegemini.assignment9;
import java.util.*;
import java.util.stream.*;

import com.capgemini.Model.Fruit;
import com.capgemini.Model.News;
import com.capgemini.Model.Trades;
import com.capgemini.Model.Transaction;

public class Streams {
	public static void main(String[] args) {
		List<Fruit> f1 = new ArrayList<Fruit>();

		// adding the elements into the list
		f1.add(new Fruit("mango", "yellow", 150, 10));
		f1.add(new Fruit("apple", "red", 100, 25));
		f1.add(new Fruit("banana", "red", 250, 3));
		f1.add(new Fruit("orange", "orange", 50, 10));
		f1.add(new Fruit("grapes", "green", 10, 60));
		System.out.println("Low Calorie Fruits............");
		List<Fruit> list = f1.stream().filter(n -> n.getCalories() < 100)
				.sorted(Comparator.comparingLong(Fruit::getCalories).reversed()).collect(Collectors.toList());
		for (Fruit f : list) {
			System.out.println(f.getName() + " " + f.getColor() + " " + f.getCalories() + " " + f.getPrice());
		}

		System.out.println("Color wise list of fruit names...........");
		Map<String, List<Fruit>> fruitMap = f1.stream().collect(Collectors.groupingBy(Fruit::getColor));
		for (Map.Entry<String, List<Fruit>> entry : fruitMap.entrySet()) {
			List<Fruit> values = entry.getValue();
			System.out.println("Key.." + entry.getKey());
			for (Fruit f : values) {
				System.out.println(f.getName() + " " + f.getColor() + " " + f.getCalories() + " " + f.getPrice());
			}
		}
		System.out.println("Displaying RED color fruits.......");
		List<Fruit> redList = f1.stream().filter(n -> n.getColor().equalsIgnoreCase("red"))
				.sorted((a, b) -> Long.compare(a.getPrice(), b.getPrice())).collect(Collectors.toList());
		for (Fruit f : redList) {
			System.out.println(f.getName() + " " + f.getColor() + " " + f.getCalories() + " " + f.getPrice());
		}
		System.out.println("##################################");
		List<News> n = new ArrayList<News>();
		n.add(new News(1, "prasanna", "bhanu", "good video"));
		n.add(new News(2, "lalitha", "bhanu", "super"));
		n.add(new News(1, "lalitha", "raja", "useful"));
		n.add(new News(2, "lalitha", "bhanu", "good job"));
		n.add(new News(1, "prasanna", "keer", "budget it"));
		Map<Integer, List<News>> NewsMap = n.stream().collect(Collectors.groupingBy(News::getNewsid));
		int maxCommentsNewsId = 0, maxComments = 0;
		for (Map.Entry<Integer, List<News>> entry : NewsMap.entrySet()) {
			if (maxComments < entry.getValue().size()) {
				maxComments = entry.getValue().size();
				maxCommentsNewsId = entry.getKey();
			}
		}
		System.out.println("News Id with max comments...." + maxCommentsNewsId);

		System.out.println("Comments conatined budget keyword........");
		List<News> budgetList = n.stream().filter(n1 -> n1.getComment().contains("budget"))
				.collect(Collectors.toList());
		for (News n1 : budgetList) {
			System.out.println(
					n1.getNewsid() + " " + n1.getPostedByUser() + " " + n1.getCommentByUser() + " " + n1.getComment());
		}

		Map<String, List<News>> postedNewsMap = n.stream().collect(Collectors.groupingBy(News::getPostedByUser));
		int maxpostedComments = 0;
		String maxUserName = "";
		for (Map.Entry<String, List<News>> entry : postedNewsMap.entrySet()) {
			if (maxpostedComments < entry.getValue().size()) {
				maxpostedComments = entry.getValue().size();
				maxUserName = entry.getValue().get(0).getPostedByUser();
			}
		}
		System.out.println("User posted max comments......" + maxUserName);

		Map<String, List<News>> commentsNewsMap = n.stream().collect(Collectors.groupingBy(News::getCommentByUser));
		for (Map.Entry<String, List<News>> entry : commentsNewsMap.entrySet()) {
			System.out.println(
					"Comments Posted By User->" + entry.getKey() + ",no.of comments->" + entry.getValue().size());
		}
		System.out.println("##################################");
		List<Transaction> tran = new ArrayList<Transaction>();
		tran.add(new Transaction(new Trades("vTrade1", "Delhi"), 2010, 40));
		tran.add(new Transaction(new Trades("sTrade2", "Indore"), 2011, 50));
		tran.add(new Transaction(new Trades("aTrade3", "Delhi"), 2011, 30));
		tran.add(new Transaction(new Trades("qTrade4", "Pune"), 2022, 40));

		List<Transaction> sortedTran = tran.stream().sorted((a, b) -> Long.compare(a.getValue(), b.getValue()))
				.collect(Collectors.toList());
		System.out.println(
				"Highest value of all Transaction...." + sortedTran.get(sortedTran.size() - 1).getTrade().getName());
		System.out.println("Smallest value of all Transaction...." + sortedTran.get(0).getTrade().getName());
		
		System.out.println("All Trans in year 2011........");
			List<Transaction> tranList = tran.stream().filter(e -> e.getYear() == 2011)
					.sorted((a, b) -> Long.compare(a.getValue(), b.getValue())).collect(Collectors.toList());
			for (Transaction trans : tranList) {
				System.out.println("Trade...." + trans.getTrade().getName() + ",Value...." + trans.getValue());
			}
		System.out.println("Sort by Trade Names.........");
			List<Transaction> sortByTradeList = tran.stream()
					.sorted((a, b) -> a.getTrade().getName().compareTo(b.getTrade().getName()))
					.collect(Collectors.toList());
			for (Transaction t : sortByTradeList) {
				System.out.println("Trade...." + t.getTrade().getName() + ",Value...." + t.getValue());
			}
	
		Map<String,List<Transaction>> citsFilter=tran.stream().collect(Collectors.groupingBy(item->item.getTrade().getCity()));
		System.out.println(citsFilter);
		System.out.println("Trans in Indore is...\n"+citsFilter.get("Indore"));
		System.out.println("Trans in Delhi is...\n"+citsFilter.get("Delhi"));
		System.out.println("Trans in Pune is...\n"+citsFilter.get("Pune"));
		
		
	}

}
