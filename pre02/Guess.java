/*The goal of this exercise is to program a Guess My Number game. When it’s finished, it should work like this:
I'm thinking of a number between 1 and 100
(including both). Can you guess what it is?
Type a number: 45
Your guess is: 45
The number I was thinking of is: 14
You were off by: 31
*/
import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Guess{
    public static void main(String[] args){
               
        //prompt the user for guess
        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a numver between 1 and 100(including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        int guess = in.nextInt();

        //generate a random number between 1 and 100 inclusive. nextInt(100) gives 0 - 99, so adding 1 at the end will change it to 1 - 100. 
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        //print out the guess and random number
        System.out.println("You guess is: " +  guess);
        System.out.println("The number I was thinking of is: " +  number);
        
        //calculate the difference and print it out
        int difference = Math.abs(guess - number);
        System.out.println("You were off by " + difference);
                   
    }
}