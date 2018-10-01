import java.util.Scanner;

class PrimeNumber{
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 and 100");
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        for (int i = 2; i <= input; i++) {
            for (int j = 2; j <= i; j++) {
                if(i==j){
                    System.out.println(i);
                    break;
                }
                else if(i%j==0){
                    break;
                }
                
            }
            
        }


    }
}