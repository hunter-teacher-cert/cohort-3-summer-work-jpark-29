import java.io.*;
import java.util.*;

//exercise 4
public class Max{
    static int[] array = {1,4,8,2,10};
    
    public static void main(String[] args){
        System.out.println("The index of the largest number in the array is " + indexOfMax(array) + ".");
    }

    public static int indexOfMax(int[] data){
        int m = 0;
        for(int i = 0; i < data.length; i++){
            if (data[i] > data[m]){
                m = i;
            }
        }
        return m;
    }
}