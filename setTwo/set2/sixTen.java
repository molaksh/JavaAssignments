package set2;

import java.util.Scanner;

public class sixTen {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter sentence to capitalize");
		String str = s.nextLine();
		s.close();
		
		
		System.out.println(capitalize(str));
		
	}
	
	public static String capitalize(String str) {
		
		String[] arr = str.split(" ");
	    StringBuffer sb = new StringBuffer();

	    for (int i = 0; i < arr.length; i++) {
	        sb.append(Character.toUpperCase(arr[i].charAt(0)))
	            .append(arr[i].substring(1)).append(" ");
	    }          
	    return sb.toString().trim();
	}
}
