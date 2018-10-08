package set2;

import java.util.Scanner;

public class sixSix {
	public static void main(String[] args) {
		
		double ratioInchToCms = 2.54;
        double inches;
        double cms;
		
        Scanner s = new Scanner(System.in);
		
		//inches cms conversion
        System.out.println("enter inches");
        inches = s.nextDouble();
        cms = inches * ratioInchToCms;
        System.out.println("when converted, "+inches+" inches becomes "+cms+" centimeters");
	}

}
