package Assignments;
import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter value between 1 to 100");
        int num = s.nextInt();
        s.close();
        int grade = (int) num/10;
        System.out.println("Grade "+grade);

        if(grade == 10){System.out.println("Perfect Score");}
        else if(grade == 9){System.out.println("Excellent");}
        else if(grade == 8){System.out.println("Nice Job");}
        else if(grade == 7){System.out.println("Average");}
        else if(grade < 7){System.out.println("Below Average");}


    }
}