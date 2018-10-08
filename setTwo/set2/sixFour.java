package set2;

import java.util.Scanner;

public class sixFour {
	public static void main(String[] args) {
			
			double hoursOfWork;
	        double basePayRate;
	        double totalPayDue;	
	        
	        Scanner s = new Scanner(System.in);
	        
			System.out.println("Enter the number of hours");
	        hoursOfWork = s.nextDouble();
	        System.out.println("Enter the base pay rate");
	        basePayRate = s.nextDouble();
	        
	        if(hoursOfWork<=40){
	            totalPayDue = hoursOfWork * basePayRate;
	        }else{
	        	totalPayDue = (40*basePayRate)+((hoursOfWork-40)*(1.5*basePayRate));
	        }
	        
	        System.out.println("The total pay for the week is "+ totalPayDue );
	        
		}
       

}
