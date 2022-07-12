//Write a program that converts a temperature from Celsius to Fahrenheit. It should (1) prompt the user for input, (2) read a double value from the keyboard, (3) calculate the result, and (4) format the output to one decimal place.

import java.util.Scanner;

public class Celsius{
    public static void main(String[] args){
        double cel;
        double fahren;
        Scanner in = new Scanner(System.in);
        
        //prompt the user for input
        System.out.print("Enter a temperature in Celsius: ");
        cel = in.nextDouble(); 
        //question: nextLine() read multiple lines whereas nextDouble() reads only 1 double?
        
        //calculate the reselt and format the output to once decimal place 
        fahren = cel*(9.0/5.0) + 32.0;  
        System.out.printf("%.1f C = %.1f F", cel, fahren);

        //Test run: 24.0 C = 75.2 F
    }
}