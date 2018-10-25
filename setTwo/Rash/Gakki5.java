package Rash;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class  Gakki5 {

	public static void main(String[] args) throws IOException {
		System.out.println("in Gakki");
		List<String> slist = new ArrayList<>();
		
		File file = new File("/Users/mohan/Desktop/gakkyTest.txt"); 
		  
		  BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String st; 
	
			
			while ((st = br.readLine()) != null ) {
				slist.add(st);
			}
			
			
			for (String string : slist) {
				String gakkifiedString = gakkify(string);
				
				System.out.println("\n"+string);
				if(gakkifiedString.length()>4) {
				System.out.println(gakkifiedString);
				}
			}
			
		  } 
		
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
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


