import java.io.*;
import java.util.*;


public class Date{
    public static void main(String[] args){
        String day = "Friday";
        String month = "June";
        int date = 24;
        int year = 2022;
            
        System.out.println("American format: " + day + ", "+ month + " " + date + ", " + year);
         System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }
}