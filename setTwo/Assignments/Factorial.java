package Assignments;
import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        long factorial=1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int input = s.nextInt();
        s.close();

        for (int i = input; i > 1 ; i--) {
            factorial = factorial * i; 
        }

        System.out.println("the factorial is "+ factorial);

    }
}