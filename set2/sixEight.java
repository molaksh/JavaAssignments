package set2;

import java.util.Scanner;

public class sixEight {
	public static void main(String[] args) {
		
		double grams;
        double pound;
        double kgs;
        double ratioPoundToGrams = 454;
        double ratioKgsToGrams = 1000;
		
        Scanner s = new Scanner(System.in);
		
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
