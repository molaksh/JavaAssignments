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

        System.out.println("Enter the number of hours");
        double hoursOfWork = s.nextDouble();
        System.out.println("Enter the base pay rate");
        double basePayRate = s.nextDouble();
        
        if(hoursOfWork<=40){
            double totalPayDue = hoursOfWork * basePayRate;
        }else{
            double totalPayDue = hoursOfWork * (basePayRate/2);

        }
        
        System.out.println("The total pay for the week is "+ totalPayDue );


    }
    

}