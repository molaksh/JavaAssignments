package set2;

import java.util.Scanner;

public class sixThree {
	public static void main(String[] args) {
		
		double hoursOfWork;
        double basePayRate;
        double totalPayDue;	
        
        Scanner s = new Scanner(System.in);
        
		System.out.println("Enter the number of hours");
        hoursOfWork = s.nextDouble();
        System.out.println("Enter the base pay rate");
        basePayRate = s.nextDouble();
        
        totalPayDue = hoursOfWork * basePayRate;
        
        System.out.println("The total pay for the week is "+ totalPayDue );
        
	}

}
