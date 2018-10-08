package set2;

import java.util.Scanner;

public class sixFive {
	
	public static void main(String[] args) {
		
		double hoursOfWork;
        double basePayRate;
        double totalPayDue;	
        double minBasePayRate = 4.35;
        double maxHoursOfWork = 60;
        
        Scanner s = new Scanner(System.in);
        
		System.out.println("Enter the number of hours");
        hoursOfWork = s.nextDouble();
        System.out.println("Enter the base pay rate");
        basePayRate = s.nextDouble();
        
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

}
