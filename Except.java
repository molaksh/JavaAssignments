import java.util.Scanner;

class Except{
    public static void main(String[] args) {
        

        while(true){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter two numeric values between 0 and 9");
      
            
        try {
            
            int a = s.nextInt();
            int b = s.nextInt();
            
            

            if(0<=a && a<=9){System.out.println("a has valid input");} 
            else{
                throw new NumberFormatException("please enter a number between 0 and 9\nretry\n");}

            if(0<=b && b<=9){System.out.println("b has valid input\nGreat!!!! \nGo Again!!\n\n");} 
            else{
                throw new NumberFormatException("please enter a number between 0 and 9\nretry\n");}

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
                //TODO: handle exception
            } catch(Exception e){
                System.out.println("any character or string are not allowed \nretry\n");
            }
            
            
        }    

      
    }
}