import java.io.*;
import java.util.*;

//exercise 5: Write a method called sieve that takes an integer parameter, n, and returns a boolean array that indicates, for each number from 0 to n - 1, whether the number is prime.
public class Sieve{
    public static void main(String[]) args{

    
    }

    public static int[] sieve(int n){
        
        boolean[] prime = new boolean[n + 1];
        for(int i = 0; i < n +1 ; i++){
            prime[i] = true;
        }
        if(prime[i]){
            for(int j = i*i ; j < n; j++)
            
        }
        return prime;
    }
  
}