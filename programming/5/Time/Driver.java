import java.io.*;
import java.util.*;


/**
 * Driver class for Time class  by Team LucidThinkeren
 * First Last
 * collaborators: First Last, First Last
 */

/**
   INSTRUCTIONS:

   This file contains the Driver starter code for our Time class.
   
   Add code in main to test all your methods
   
   Place this file in a folder named programming/5/Driver.java

*/


public class Driver {

    public static void main(String[] args) {

	//declare a var of appropriate type to assign an instance of Time to
	    Time t = new Time(9,31,40);
      System.out.println("t is " + t.toString());

      Time t1 = new Time();
      System.out.println("t1 is " + t1.toString());

      //since we cannot have a void method inside of print method, we should have a separate t.add(t2) to update t, before the print method. 
      Time t2 = new Time(2,4,5);
      t.add(t2);
      System.out.println("t + t2 is " + t.toString());
      
      boolean result = t.equals(t2);
      System.out.println(result);

      int compare = t.compareTo(t2);
      System.out.println(compare);
      
    }

}//end class