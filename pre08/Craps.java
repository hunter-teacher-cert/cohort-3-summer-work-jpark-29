import java.io.*;
import java.util.*;

public class Craps{
    public static void main(String[] args){
       
        //takes a parameter from the command line, play that many rounds, and as it plays indicate each time the shooter wins or loses. The program should also print out the status of the rounds they occur.
        System.out.println("Welcome! How many rounds would you like to play the game? ");
        Scanner input = new Scanner(System.in);
        int turns = input.nextInt();
        for (int i = 1; i < turns + 1; i++){
            if(round() == true){
                System.out.println("Round " + i + ": The player wins!:D");
            } else{
                System.out.println("Round " + i + ": The player loses!:(");
            }
        }        
    }

    //accepts an integer parameter and returns a random number between 1 and that number, inclusive. 
    //question: do I need this method? I don't think I need it. 
    public static int roll(int n){
        Random random = new Random();
        int number = random.nextInt(n) + 1;
        return number;
    }

    //accepts two parameters - a number of dice and the maximum value for those dice and returns the result of rolling those dice
    public static int shoot(int dice, int max){
        int diceSum = 0;

        for(int i = 0; i < dice; i++){
            diceSum += roll(max);
        }
        return diceSum;
        
    }

    //accepts no parameters and it should return something to indicate if the shooter of the round wins or loses
    public static boolean round(){
        //If he rolls a 2,3, or 12,that’s Craps and he loses.
        int diceSum = shoot(2,6);
        if(diceSum == 2 || diceSum == 3 || diceSum == 12){
            return false;
        } else if(diceSum == 7 || diceSum == 11){ //If he rolls a 7 or 11, that’s a Natural and he wins.
            return true;
        } else{
            //the value he rolled is now called the Point
            int point = diceSum; 
            while (point != diceSum && point != 7){
                shoot(2,6);
            }
            if (point == diceSum){
                return true;
            } else {
                return false;
            }
        }
    }
}