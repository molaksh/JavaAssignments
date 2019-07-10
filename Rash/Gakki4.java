package Rash;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


//working code -> accepts input from command line and gakkify
public class  Gakki4 {

	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the string");
			String str = s.nextLine();
			s.close();
			
			String gakki = gakkify(str);
			
			if(gakki.length()>4) {
				System.out.println(gakki);
				}
			else {
				System.out.println("sorry, no gakki for you");
			}
			System.out.println("\nThank you!!");
		}
	
	public static String gakkify( String str) {
		char[] c = str.toCharArray();
		String gakkiString = "";
		Set<Character> cSet = new HashSet<>();
		
		for (Character character : c) {
			cSet.add(character);
		}
		
		
		
		List<Character> tempList = new ArrayList<>();
		
		for (Character ch : cSet) {
			tempList.add(ch);
		}
		
		
		for(int j=0;j<tempList.size();j++) {
		for(int k =0; k<tempList.size();k++) {
			if(j==k) {continue;}
			else {
				
				
				String keepChar1 = Character.toString(tempList.get(j));
				String keepChar2 = Character.toString(tempList.get(k));
					
				String tempString = str;
				char[] tempChar = tempString.toCharArray();
				
				List<String> gakkiList = new ArrayList<>();
				List<String> newGakkiList = new ArrayList<>();
				for (char character : tempChar) {
					gakkiList.add(Character.toString(character));
				}
				
				for (int l =0;l<gakkiList.size();l++) {
					if(gakkiList.get(l).equals(keepChar1)  || gakkiList.get(l).equals(keepChar2)) {
						
						newGakkiList.add(gakkiList.get(l));
						continue;
						
					}else {
						
					}
					
				}
				
				gakkiString = String.join("", newGakkiList);
				
				
				StringBuffer compStringbfr1 = new StringBuffer() ;
				for(int i = 0; i<gakkiString.length(); i++) {
					if(i==0 || i%2==0) {
						compStringbfr1.append(keepChar1);
					}else {
						compStringbfr1.append(keepChar2);
					}
				}

				
				
				
				StringBuffer compStringbfr2 = new StringBuffer() ;
				for(int i = 0; i<gakkiString.length(); i++) {
					if(i==0 || i%2==0) {
						compStringbfr2.append(keepChar2);
					}else {
						compStringbfr2.append(keepChar1);
					}
				}

				
				
				String compString1 = compStringbfr1.toString();
				String compString2 = compStringbfr2.toString();
				
				
				if(gakkiString.equals(compString1) || gakkiString.equals(compString2)) {
					
					return gakkiString;
					
				}
				
				
			}
		}
	}
		
		
		return "";
		
	}
	
	
}



