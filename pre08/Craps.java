import java.io.*;
import java.util.*;

public class Craps{
    public static void main(String[] args){
        System.out.println(roll(5));
        //program it so that you take the user input
        System.out.println(shoot(1,6));
        
    }

    //accepts an integer parameter and returns a random number between 1 and that number, inclusive. 
    //question: do I need this method? I don't think I need it. 
    public static int roll(int n){
        Random random = new Random();
        int number = random.nextInt(n) + 1;
        return number;
    }

    //accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice
    public static int shoot(int d, int m){
        Random dieRoll = new Random();
        int diceSum = 0;

        for(int i = 0; i < d; i++){
            diceSum += dieRoll.nextInt(m) +1;
        }
        return diceSum;
        
    }

    //accepts no parameters and it should return something to indicate if the shooter of the round wins or loses
    // public static String round(){
        
    // }
}