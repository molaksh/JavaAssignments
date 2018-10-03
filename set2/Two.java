class Two{
    public static void main(String[] args) {
        child c = new child();

        System.out.println(c.Add(1, 2));  
        System.out.println(c.Factorial(12));
        System.out.println(c.SquareRoot(4.12f)); 
        System.out.println(c.SquareRoot(4));

    }
}
interface parent{
     int Add(int a, int b);
     int Subtract(int a, int b);
     int Multiply(int a, int b);
     int Divide(int a, int b);
     double SquareRoot(float number);
     double SquareRoot(int number);
     long Factorial(int number);
}
class child implements parent{

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