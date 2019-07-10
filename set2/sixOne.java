package set2;

import java.util.Scanner;

public class sixOne {
	public static void main(String[] args) {
		
		double salesTax = 8.25/100;
		double price;
		double salesTaxAmount;
		double finalAmount;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the price: ");
        price = s.nextDouble();
        salesTaxAmount = price * salesTax;
        finalAmount = price + salesTaxAmount;

        System.out.println("Price = "+ price);
        System.out.println("Sales Tax = "+ salesTaxAmount);
        System.out.println("Total Price = "+finalAmount);
	}

}
