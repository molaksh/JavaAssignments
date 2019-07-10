package Assignments;
import java.util.Scanner;

class Operators{
    public static void main(String[] args) {
        double result;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = s.nextInt();
        System.out.println("Enter second number: ");
        int n2 = s.nextInt();
        System.out.println("Enter an operator \n1-Add \n2-Subtract \n3-Multiply \n4-Divide");
        int operator = s.nextInt();

        System.out.println("you have selected "+operator +" operation");

        switch(operator){
            case 1: result = n1+n2; System.out.println("Result ="+(int)result);break;
            case 2: result = n1-n2; System.out.println("Result ="+(int)result);break;
            case 3: result = n1*n2;System.out.println("Result ="+(int)result);break;
            case 4: result = (double) n1/n2;System.out.println("Result ="+result);break;
        }
        




    }
}