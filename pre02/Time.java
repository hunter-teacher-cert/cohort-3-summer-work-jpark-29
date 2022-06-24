import java.io.*;
import java.util.*;

public class Time{
    public static void main(String[] args){
        //starting time
        int hour = 18;
        int minute = 45;
        int second = 35;

        //ending time
        int hour2 = 19;
        int minute2 = 30;
        int second2 = 53; 

        //calculations
        int numSec = (hour*60)*60 + second;
        int secLeft = 60*60*24 - numSec;
        double numSec2 = (hour*60)*60 + second;
        double percentage = (numSec2/(60.0*60.0*24.0))*100.0;

//question: they suggested using a temp variable. but how can I update the values of the origianl hour, minute, and second without messing with the time when I started? idk how it works... I'm just gonna create new variables. 
//original question:Change the values of hour, minute, and second to reflect the current time. Then write code to compute the elapsed time since you started working on this exercise.
        int numSec3 = (hour2*60)*60 + second2;
        int elapsedTime = numSec3 - numSec;
            
        //print statements
        System.out.println("The number of seconds since midnight is: " + numSec + " seconds.");
        System.out.println("The number of seconds remaining in the day is: " + secLeft + " seconds.");
        System.out.println("The percentage of the day that has passed is: " + percentage + "%");
        System.out.println("The elapsed time since I started working on this exercie in second is: " + elapsedTime);
        
    }
}