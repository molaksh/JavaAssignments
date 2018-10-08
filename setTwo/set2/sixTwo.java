package set2;

import java.util.Random;
import java.util.Scanner;

public class sixTwo {
	public static void main(String[] args) {
			
			double salesTax = 8.25/100;
			double price =0;
			double salesTaxAmount;
			double finalAmount;
			Random rand = new Random();
			int r = rand.nextInt(11);
			int[] input = new int[r];			
			
			Scanner s = new Scanner(System.in);
			
			
			for (int i = 0; i < input.length; i++) {
				int count=i;
				System.out.print("Enter the price for item "+ ++count +": ");
				input[i]=s.nextInt();
			}
			
			for (int i : input) {
				price = price+i;
			}
			
			System.out.println("\nSum of prices of "+r+" items are "+price);
			
	        
	        salesTaxAmount = price * salesTax;
	        finalAmount = price + salesTaxAmount;
	
	        System.out.println("Price = "+ price);
	        System.out.println("Sales Tax = "+ salesTaxAmount);
	        System.out.println("Total Price = "+finalAmount);
		}
}
