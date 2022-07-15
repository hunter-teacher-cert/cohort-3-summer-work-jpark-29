import java.io.*;
import java.util.*;

public class Driver{
  public static void main(String[] args) {
    LinkedList l = new LinkedList();
    System.out.println(l); //empty list
    l.add("one");
    System.out.println(l); //should print "one-->"
    l.add("two");
    System.out.println(l); //should print "two-->one-->"

  }
}