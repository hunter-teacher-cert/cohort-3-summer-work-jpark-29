import java.io.*;
import java.util.*;


public class Methods{
    public static void main(String[] args){
        System.out.println(isDivisible(4,3));
        System.out.println(isTriangle(3,4,100));
        System.out.println(ack(1, 1));
    }
   
    //isDivisible method
    public static boolean isDivisible(int n, int m){
        return n % m == 0;
    }

    //isTriangle method
    public static boolean isTriangle(int a, int b, int c){
       return a + b > c && b + c > a && c + a > b;
    }

    //ack method - double check?
    public static int ack(int m, int n){
        if (m == 0){
            return n + 1;
        } else if (m > 0 && n == 0){
            return ack(m-1, 1);
        } else
        return ack(m-1, ack(m, n-1));
    }    
    
}