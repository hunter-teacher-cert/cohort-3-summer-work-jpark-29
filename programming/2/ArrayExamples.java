import java.io.*;
import java.util.*;


public class ArrayExamples{
    
    //global variable - static means any objects made out of this class has access 
    static int [] someData = new int[] {45, 23, 78, 0, 0};
    
    static int someDataSize = 3;

    public static void main(String[] args){
        printArray(someData);
        printPartialArray(someData, someDataSize);
        int theIndex = find(78, someData);
        System.out.println("78 is in the position " + theIndex);
        theIndex = find(20, someData);
        System.out.println("20 is in the position " + theIndex);
        System.out.println("If the position is -1, then it means that the number is not found in the array.");
        System.out.println("");
        
    }

    //int[] data - data is placeholder/local variable just for this function 
    //precondition: assume array is filled
    public static void printArray(int[] data){
        for (int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    //precondition: assume array is partially filled
    public static void printPartialArray(int[] data, int currSize){
        for (int i = 0; i < currSize; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

    //returns position of target item if found
    //if not found, then return the array size
    public static int find(int targetItem, int [] data){
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == targetItem){
                return i;
            }
        }
        //post condition: loop ended

        return -1;
    }
}