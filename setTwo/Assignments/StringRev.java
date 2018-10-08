package Assignments;
import java.util.Scanner;

class StringRev{
    public static void main(String[] args) {

        while(true){
            Scanner s = new Scanner(System.in); 
            String str = s.next();
            
            String rev = reverse(str);
            System.out.println( rev);
        }
    }

    public static String reverse(String s){
        String rev = "";
        int strLength = s.length();
        for (int i = strLength -1; i >= 0; i--) {
            rev=rev+s.charAt(i);
        }    
        return rev;
        }
            
        
}