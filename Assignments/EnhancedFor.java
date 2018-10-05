package Assignments;
class EnhancedFor{
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,7,8};
        int total =0;

        for (int x : arr) {
            System.out.println("x = "+x);
            total += x;
        }
        System.out.println("sum of all values in array is "+ total);
    }
}