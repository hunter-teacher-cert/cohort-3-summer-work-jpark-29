import java.io.*;
import java.util.*;

//exercise 1
public class Array{
    public static void main(String[] args){
        double[] powNum = {2.0, 3.0, 4.0};
        powArray(powNum, 2);
    }

    public static double[] powArray(double[] a, int n){
        double[] b = new double[a.length];
        for(int i = 0; i < a.length; i++){
            b[i] = Math.pow(a[i], n);
            System.out.println(b[i]);
        }
        return b;
    }
}