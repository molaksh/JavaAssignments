package set2;
//package setTwo;

import java.util.Scanner;

class Six{
    public static void main(String[] args) {
    	
    	
        double salesTax = 8.25/100;
        double totalPayDue;
        double price;
        double salesTaxAmount;
        double finalAmount;
        double hoursOfWork;
        double basePayRate;
        double minBasePayRate = 4.35;
        double maxHoursOfWork = 60;
        double ratioInchToCms = 2.54;
        double inches;
        double cms;
        double grams;
        double pound;
        double kgs;
        double ratioPoundToGrams = 454;
        double ratioKgsToGrams = 1000;
        
        
        
        
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the price: ");
        price = s.nextDouble();
        salesTaxAmount = price * salesTax;
        finalAmount = price + salesTaxAmount;

        System.out.println("Price = "+ price);
        System.out.println("Sales Tax = "+ salesTaxAmount);
        System.out.println("Total Price = "+finalAmount);

        System.out.println("Enter the number of hours");
        hoursOfWork = s.nextDouble();
        System.out.println("Enter the base pay rate");
        basePayRate = s.nextDouble();
        
        if(hoursOfWork<=40){
            totalPayDue = hoursOfWork * basePayRate;
        }else{
            totalPayDue = hoursOfWork * (1.5*basePayRate);

        }
        
        System.out.println("The total pay for the week is "+ totalPayDue );
        
        if( (basePayRate < minBasePayRate) || (hoursOfWork > maxHoursOfWork)) {
        	try {
				throw new Exception(" your pay is less or your hours of work is more");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
        }
        //inches cms conversion
        System.out.println("enter inches");
        inches = s.nextDouble();
        cms = inches / ratioInchToCms;
        System.out.println("when converted, "+inches+" inches becomes "+cms+" centimeters");
        
        System.out.println("enter centimeters");
        cms = s.nextDouble();
        inches = cms * ratioInchToCms;
        System.out.println("when converted, "+cms+" centimeters becomes "+inches+" inches");
        
        //gram pound kgs
        System.out.println("enter pound");
        pound = s.nextDouble();
        grams= pound *ratioPoundToGrams;
        kgs = grams * (1/ratioKgsToGrams);
        System.out.println("when converted, "+pound+" pounds becomes "+kgs+" kilograms");
        
        System.out.println("enter kgs");
        kgs = s.nextDouble();
        grams = kgs * ratioKgsToGrams;
        pound = grams * (1/ratioPoundToGrams);
        System.out.println("when converted, "+kgs+" kilograms becomes "+pound+" pounds");
        
        


    }
    

}