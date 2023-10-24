import java.util.Scanner;
import java.lang.Math;
public class GuessingGame{
    public static void main(String[] args) {
        int a=(int)(Math.random()*100)+1;
        int k=5;
        Scanner in=new Scanner(System.in);
        boolean correct=false;
        System.out.println("I am thinking of a no between 1and 100\n you have 5 tries to guess the number");
        while(k>0){
            System.out.println("enter your guess");
            int guess=in.nextInt();
            if(guess==a){
                System.out.println("you guessed the number \n you win");
                break;
            }
            else if(guess>a){
                System.out.println("you guess too high\nyou have"+(k-1)+"tries left");
                k--;
            }
            else{
                System.out.println("you guess too low\nyou have"+(k-1)+"tries left");
            }
            k--;
        }
        if(correct==false){
            System.out.println("you ran out of train\nyou lose");
        }
    }
}
