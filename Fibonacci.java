import java.util.Scanner;

class Fibonacci{
    public static void main(String[] args) {
        System.out.print("enter a limit for fibonacci: ");
        Scanner s = new Scanner(System.in);
        int value = s.nextInt();
        for (int i = 1; i <= value; i++) {
            System.out.print(fibo(i)+" "); 
        }
        

    }
    public static long fibo(int i){
        if(i==0){return 0;}
        else if(i<=2){return 1;}
        else{
            long fib = fibo(i-2)+fibo(i-1);
            return fib;
        }      
        
    }
}