package set2;
//package setTwo;

import java.util.Scanner;

class Six{
    public static void main(String[] args) {
    	
        double price;
        double hoursOfWork;
        double basePayRate;
        double inches;
        double cms;
        double pound;
        double kgs;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the price: ");
        price = s.nextDouble();
        System.out.println();
        
        salesTaxCalc(price);
        
        
        System.out.println("Enter the number of hours");
        hoursOfWork = s.nextDouble();
        System.out.println("Enter the base pay rate");
        basePayRate = s.nextDouble();
        
        weeklyPayCalc(hoursOfWork,basePayRate);
        
        
        System.out.println("enter inches");
        inches = s.nextDouble();
        
        inchTocms(inches);
        
        System.out.println("enter centimeters");
        cms = s.nextDouble();
        
        cmsToInch(cms);
        
        System.out.println("enter pound");
        pound = s.nextDouble();
        
        poundsToKgs(pound);
        
        System.out.println("enter kgs");
		kgs = s.nextDouble();
		
		kgsToPounds(kgs);
        
        s.close();
        
        
    }
    
    public static void salesTaxCalc(double price){
    	
    	double salesTax = 8.25/100;
    	double salesTaxAmount;
        double finalAmount;

        
        salesTaxAmount = price * salesTax;
        finalAmount = price + salesTaxAmount;
        
        System.out.println("Price = "+ price);
        System.out.println("Sales Tax = "+ salesTaxAmount);
        System.out.println("Total Price = "+finalAmount);
        
    }
    
    public static void weeklyPayCalc(double hoursOfWork, double basePayRate) {
    	
    	
    	double minBasePayRate = 4.35;
        double maxHoursOfWork = 60;
        double totalPayDue;

       
        
        if( (basePayRate < minBasePayRate) || (hoursOfWork > maxHoursOfWork)) {
        	try {
				throw new Exception(" either your pay is less or your hours of work is more");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
        }
        
        else if(hoursOfWork<=40){
            totalPayDue = hoursOfWork * basePayRate;
            System.out.println("The total pay for the week is "+ totalPayDue );
        }
        else{
        	totalPayDue = (40*basePayRate)+((hoursOfWork-40)*(1.5*basePayRate));
        	System.out.println("The total pay for the week is "+ totalPayDue );
        }
        
    }
    
    public static void inchTocms(double inches) {
    	
    	double ratioInchToCms = 2.54;
    	double cms;
        
        cms = inches * ratioInchToCms;
        System.out.println("when converted, "+inches+" inches becomes "+cms+" centimeters");
    }
	 public static void cmsToInch(double cms) {
	    	
	    	double ratioInchToCms = 2.54;
	    	double inches;
	    
	        
	        inches = cms / ratioInchToCms;
	        System.out.println("when converted, "+cms+" centimeters becomes "+inches+" inches");
	 }
	 
	 public static void poundsToKgs(double pound) {
		 
		 double grams;
		 double kgs;
		 double ratioPoundToGrams = 454;
		 double ratioKgsToGrams = 1000;
        
        
        grams= pound *ratioPoundToGrams;
        kgs = grams * (1/ratioKgsToGrams);
        System.out.println("when converted, "+pound+" pounds becomes "+kgs+" kilograms");
	 }
	 
	public static void kgsToPounds(double kgs) {
			 
		 double grams;
		 double pound;
		 double ratioPoundToGrams = 454;
		 double ratioKgsToGrams = 1000;
		 
		 grams = kgs * ratioKgsToGrams;
		 pound = grams * (1/ratioPoundToGrams);
		 System.out.println("when converted, "+kgs+" kilograms becomes "+pound+" pounds");
        
	}

}