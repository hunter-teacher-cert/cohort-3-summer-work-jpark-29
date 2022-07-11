import java.io.*;
import java.util.*;


public class Loops{
    public static void main(String[] args){
        loop(10);
        System.out.println("");
        System.out.println("factorial test: " + factorial(3));
        System.out.println("");
        System.out.println("square root test: " + squareRoot(9.0));
        System.out.println("");
        System.out.println("power test: " + power(2.0, 3));
    }

    //exercise 1
    public static void loop(int n){
        int i = n;
        System.out.println("i" + " " + "n");
        while (i > 1){
            System.out.println(i + " " + n);
            if(i % 2 == 0){
                i = i/2;
            } else {
                i = i + 1;
            }
        }
    }
    
    //exercise 2
    public static double squareRoot(double a){
        
        // x0 - rough guess
        double x0 = a/2.0;
        // squareRoot - improving the guess 
        double squareRoot = (x0 + a/x0)/2.0;

        //iterate until it gets two consecutive estimates that differ by less than 0.0001.
        while(Math.abs((squareRoot-x0)) > 0.0001){
            x0 = squareRoot;
            squareRoot = (x0 + a/x0)/2.0;
        }  
        return squareRoot;
    }

    //exercise 3
    public static double power(double x, int n){
        double total = 1.0;
        //repeat the computation n times
        for(int i = 0; i < n; i++ ){
            total = x*total;
        }
        return total;
    } 
    
    //exercise 4
    public static int factorial(int n){
        int result = 1;
        for(int i = 1; i <= n; i++){
            result = result*i;
        }
        return result;
    }
}