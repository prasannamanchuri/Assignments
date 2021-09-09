package com.capgemeni.assignment10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) throws IOException {
		boolean flag = true;
		int i=1;
		while (flag) {
			String filePath = "C:\\Users\\PMANCHUR\\prasanna\\price.txt",
					totalfilePath = "C:\\Users\\PMANCHUR\\prasanna\\totalprice.txt";
			System.out.print("Select your option (");
			System.out.print("1: Insert new price, ");
			System.out.print("2: View Purchase Total, ");
			System.out.print("3: exit )");
			Scanner sc = new Scanner(System.in);
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				String ans = "";
				while (!ans.equalsIgnoreCase("No")) {
					System.out.println("Insert "+i+" price");
					int price = sc.nextInt();
					appendUsingFileWriter(filePath, price, totalfilePath);
					System.out.println("Do you want to enter price for more items? (Yes/No)?");
					ans = sc.next();
				}
				break;
			case 2:
				System.out.println("total price of the menu:" + checkFileContents(totalfilePath));
				break;
			case 3:
				System.out.println("exit program.....");
				File f=new File(filePath);
				File f1=new File(totalfilePath);
				if(f.exists())
					f.delete();
				if(f1.exists())
					f1.delete();
				flag = false;
				break;
			default:
				System.out.println("choose valid oyption");

			}
		}

	}

	private static void appendUsingFileWriter(String filePath, int price, String totalFilePath) {
		try {
			int count = checkFileContents(filePath);
			try (FileWriter fw = new FileWriter(filePath, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter out = new PrintWriter(bw)) {
				if (count > 0)
					out.println(price);
				else
					out.println(price);
			} catch (IOException e) {
				e.printStackTrace();
			}
			PrintWriter writer = new PrintWriter(totalFilePath);
			writer.print("");
			writer.close();
			try (FileWriter fw = new FileWriter(totalFilePath, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter out = new PrintWriter(bw)) {
				out.println(count+price);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("Price has been saved to file");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	private static int checkFileContents(String filePath) throws IOException {
		int count = 0;
		try {
			// the file to be opened for reading
			FileInputStream fis = new FileInputStream(filePath);
			Scanner sc = new Scanner(fis); // file to be scanned
			// returns true if there is another line to read
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				if (!s.isEmpty())
					count += Integer.parseInt(s);
			}
			sc.close(); // closes the scanner
		} catch (IOException e) {
			e.printStackTrace();
		}
		return count;
	}

	public static void main1(String[] args) throws IOException {
		try (FileWriter fw = new FileWriter("C:\\Users\\PMANCHUR\\prasanna\\totalprice.txt", true);
				BufferedWriter bw = new BufferedWriter(fw);
				PrintWriter out = new PrintWriter(bw)) {
			out.println(100);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
