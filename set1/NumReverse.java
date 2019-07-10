package Assignments;
import java.util.Scanner;

class NumReverse{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("enter your number: ");
            String input = s.next();
            if(input.equals("quit")){break;}
            try {
                int inp = Integer.parseInt(input);
          
            
                int reminder, rev =0;
                while(inp>0){
                    reminder = (int) inp %10;
                    rev = (rev*10) + reminder;
                    inp = (int) inp/10; 
                }
            
                System.out.println("Your number is "+ input);
                System.out.println("Reverse number is "+ rev);
                System.out.println();
            } catch (Exception e) {
                System.out.println("enter an integer");continue;}
            

        }
    }
}