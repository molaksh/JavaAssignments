package set2;

import java.util.Scanner;

public class sixSeven {
public static void main(String[] args) {
		
		double ratioInchToCms = 2.54;
        double inches;
        double cms;
		
        Scanner s = new Scanner(System.in);
		
        System.out.println("enter centimeters");
        cms = s.nextDouble();
        inches = cms / ratioInchToCms;
        System.out.println("when converted, "+cms+" centimeters becomes "+inches+" inches");
        
	}

}
