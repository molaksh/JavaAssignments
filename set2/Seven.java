package set2;

import java.util.Scanner;

public class Seven {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a hexa-decimal value");
		String str = s.next();
		s.close();
		
		str = str.toUpperCase();
		
		int value =0;
		
		try {
		
		for (int i = 0; i < str.length(); i++) {
			
			if(hexValue(str.charAt(i)) != -1) {
				
				value = value*16+(hexValue(str.charAt(i)));
				
			}
			else {
				
				throw new NumberFormatException("Invalid hexa decimal character");
				
			}
			
		}
		
		System.out.println("The decimal equivalent of "+str+" is "+value);
		
		}catch(NumberFormatException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int hexValue(char c) {
		
		int deciValue;
		
			switch(c) {
				case '0': deciValue = 0; break;
				case '1': deciValue = 1; break;
				case '2': deciValue = 2; break;
				case '3': deciValue = 3; break;
				case '4': deciValue = 4; break;
				case '5': deciValue = 5; break;
				case '6': deciValue = 6; break;
				case '7': deciValue = 7; break;
				case '8': deciValue = 8; break;
				case '9': deciValue = 9; break;
				case 'A': deciValue = 10; break;
				case 'B': deciValue = 11; break;
				case 'C': deciValue = 12; break;
				case 'D': deciValue = 13; break;
				case 'E': deciValue = 14; break;
				case 'F': deciValue = 15; break;
				default: deciValue = -1; 
			}
			
		return deciValue;
		
	}

}
