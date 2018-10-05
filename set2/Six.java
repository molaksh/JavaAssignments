package set2;
//package setTwo;

import java.util.Scanner;

class Six{
    public static void main(String[] args) {
        double salesTax = 8.25/100;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the price: ");
        double price = s.nextDouble();
        double salesTaxAmount = price * salesTax;
        double finalAmount = price + salesTaxAmount;

        System.out.println("Price = "+ price);
        System.out.println("Sales Tax = "+ salesTaxAmount);
        System.out.println("Total Price = "+finalAmount);
    }
    

}