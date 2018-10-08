package Assignments;
import java.util.Random;
import java.util.Scanner;

class GuessingGame{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner s = new Scanner(System.in);

        //new Random().nextInt((max - min) + 1) + min
        //int i = rand.nextInt(1000 - 1)+1)+1
        int randInt = rand.nextInt(1000)+1;
        System.out.println("random ="+randInt);

       
        int count = 0;
        while (true){
            System.out.print("Guess the number: ");
            int guess = s.nextInt();
            if(guess>randInt){System.out.println("Too High");}
            if(guess<randInt){System.out.println("Too Low");}
            if(guess==randInt){System.out.println("You Are Correct");break;}
            count++;
        }
        System.out.println("You took "+ ++count +" guesses to get it right!");
       
        
        
    }

}