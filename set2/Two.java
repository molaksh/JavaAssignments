package set2;
import java.util.Scanner;


class Two{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        child c = new child();

        System.out.println("Select Operation\n1.Addition\n2.Sub\n3.Muliply\n4.Divide\n5.Square Root(Float)\n6.Square Root (int)\n7.Factorial");
        int i = s.nextInt();

        switch(i){
            case 1:{
                int a = getIntInput();
                int b = getIntInput();
                int r = c.Add(a,b);
                System.out.println("Result = "+r);
                break;
            } 
            case 2:{
                int a = getIntInput();
                int b = getIntInput();
                int r = c.Subtract(a,b);
                System.out.println("Result = "+r);break;
            }
            case 3:{
                int a = getIntInput();
                int b = getIntInput();
                int r = c.Multiply(a,b);
                System.out.println("Result = "+r);break;
            }
            case 4:{
                int a = getIntInput();
                int b = getIntInput();
                int r = c.Divide(a,b);
                System.out.println("Result = "+r);break;
            }
            case 5:{
                float a = getFloatinput();
                double r = c.SquareRoot(a);
                System.out.println("Result = "+r);break;
            }
            case 6:{
                int a = getIntInput();
                double r = c.SquareRoot(a);
                System.out.println("Result = "+r);break;
            }
            case 7:{
                int a = getIntInput();
                long r = c.Factorial(a);
                System.out.println("Result = "+r);break;
            }

            default:{
                System.out.println("you didnt enter relevant value!! BYE!!");break;
            }
        }
        

        

    }
    static int getIntInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int a = s.nextInt();
        //s.close();
        return a;
    }

    static float getFloatinput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a float value");
        float a = s.nextFloat();
        return a;
    }
}
interface parent{
    //1. with default keyword we can define methods in interfaces
    default int Add(int a, int b){
        System.out.println("whatever");return 1;
    }
     int Subtract(int a, int b);
     int Multiply(int a, int b);
     int Divide(int a, int b);
     double SquareRoot(float number);
     double SquareRoot(int number);
     long Factorial(int number);
}
class child implements parent{
    //2. in updated version of java, it is not required to define 
    //all the methods of interface in the implementing class 

    //3. same methods can be defined in interfaces (default key word) and
    //implementing classes. method in the interface will be overridden. 
    //meaning, function call will run the method from implemented class 
    public int Add(int a, int b){
        int c = a+b;
        return c;
    }
    public int Subtract(int a, int b){
        int c = a-b;
        return c;

    }
    public int Multiply(int a, int b){
        int c = a*b;
        return c;

    }
    public int Divide(int a, int b){
        int c = (int)a/b;
        return c;

    }
    public double SquareRoot(float number){
        double c = Math.sqrt(number);
        return c;

    }
    public double SquareRoot(int number){
        double c = Math.sqrt(number);
        return c;

    }
    public long Factorial(int input){
        long factorial=1;
        for (int i = input; i > 1 ; i--) {
           factorial = factorial * i; 
        }
        return factorial;
    }

}