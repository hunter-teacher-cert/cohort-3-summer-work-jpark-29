import java.io.*;
import java.util.*;

/*

Sort Project:

Part 1:  (BASIC)
  1. Analyze the two constructors - try to figure out how they work.
  2. Compile and run the program (SortProjectDriver.java and SortProject.java) and confirm
  the behavior of the constructors.

  Part 2: (BASIC)
  1. Read the description of findSmallestIndex and complete the method.
  2. Uncomment the lines in SortProjectDriver to test.

  Part 3: (INTERMEDIATE)
  1. Complete the sort method - read comments for description
  2. Uncomment the lines in sortProjectDriver to test.



Search Project:
  1. Complete the linear search (BASIC)
  2. Complete the binary search (Intermediate)
  3. Complete the recursive version of binary search (Advanced)
*/

public class SortSearch{

    /* Sort project starts here */
    
    /* Instance Variables */
    private ArrayList<Integer> data;  // to store the data
    
    private Random r; 

    //defualt constructor: populate the ArrayList with 15 random numbers ranging from 0 to 19. [4, 18, 12, 9, 0, 12, 9, 9, 8, ]
    public SortSearch(){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i = 0; i < 15 ; i++){
    	    data.add(r.nextInt(20)); //random integers from 0 to 19. 
	    }
	
    }
    
  //Generate a ordered list
    public SortSearch(int size, boolean ordered){
      data = new ArrayList<Integer>(size); // make it large
      for (int i = 0 ; i < size; i++){
        data.add(i);
      }
	
    }


    //overloaded constructor(with parameters): populate the ArrayList with given number(size) of random numbers ranging from 0 to 19.
    public SortSearch(int size){
    	data = new ArrayList<Integer>();
    	r = new Random();
    	for (int i = 0; i < size; i++){
    	    data.add(r.nextInt(20));
	    }
	
    }

    /* Convenience function to get data out of the ArrayList from the driver */
    public int get(int index){
	    return this.data.get(index);
    }
    


    /*
      return the index of the smallest data idem from index start to the end
      of the ArrayList. If there are multiple of the smallest value,
      return any of them.
      
      Example, if the arraylist has:
      5,2,       10,6,8
      findSmallestIndex(2);
      if start was 2 (start at index 2, value 10) then it would return 3 which is the index of the value 6 which is the index with the
      smallest value from start to end

      On the otherh and, if start was 0, then the method would
      return 1 since the value 3 is in index 1 and that is the smallest.
      
    */
    public int findSmallestIndex(int start){
    	int smallIndex = start;
      int currSmall = this.data.get(start); //instantiate another variable to hold the current smallest value
    	//iterate through the ArrayList starting from start to this.data.size()
      for(int i = start; i < data.size(); i++){
        if(data.get(i) < currSmall){
          currSmall = data.get(i);
          smallIndex = i;
        }
      }
      //compare each item with the current smallest value and update the current smallest value 
    	return smallIndex;
    }


    /**
       Implement the selection sort algorithm by sorting the ArrayList
       data in place.

       Algorithm:
       Loop a variable that represents the ArrayList index from
       0 to the end of the ArrayList.
       For each index, find the smallest from that Location
	 to the end of the array and swap it with that index. 

      5,2,10,6,8 (compare 5 to everything)

      2,5,10,6,8 (swap 2&5, compare 5 to everything else. Then compare 10 to everything)

      2,5,6,10,8 (swap 6&10, compare 10 with everything after)

      2,5,6,8,10 (swap 10&8)

    */
    public void sort(){
      //iterate throught the data(A.L.) starting from 0 to data.size() 
      //update the findSmallestIndex arguement
      int temp = 0;
      int minIndex = 0;
      
      for(int i = 0; i < data.size(); i++){
        minIndex = findSmallestIndex(i); //
        temp = data.get(minIndex); //assigning 5 to temp 
        data.set(minIndex,data.get(i));
        data.set(i, temp);
        
        // int temp = dataList.get(index1); //get the value at index 1
        // dataList.set(index1, dataList.get(index2)); //get the value of index 2
        // dataList.set(index2, temp); //put temp at index2 
      }
    }



    /* Search project starts here */
    
    /**
       performs a linear search. Returns the index of the first occurence of
       value in the ArrayList data or -1 if not found.

       This works by starting at the first element and searching one element at a time 
       until either the element is found or you've looked at all the elements.

       This algorithm works on any ArrayList.

    */
    public int linearSearch(int value){
	    //iterate through the data until data.size()
      //if data.get(i) == value, return i, else return -1
      for(int i = 0; i < data.size(); i++){
        if(data.get(i) == value){
          return i;
        }
      }
	    return -1; 
    }
    
    /**
       Implement a binary search as specified by the comments
       
       This algorithm only works on sorted ArrayLists.
    */
    public int binarySearch(int value){

	// create assign variables  representing the high, low and middle indices 
	// while we're not done:
	//   if the item is at data.get(middle), return middle
	//   otherwise, update high, low, and middle
      int high = data.size() - 1;
      int low = 0;
      int mid = (low + high)/2; // average

      //Print out the values of lo:mid:hi for each call
      //System.out.println(low + ":" + mid + ":" + high);
        
      boolean binaryS = true;

      while(binaryS){
        if(data.get(mid) == value){
          return mid;
        } else { // when the data != value
          if(value < data.get(mid) ){ // when value < mid
            high = mid - 1;
            mid = (low + high)/2;
          } else{ //when value > mid
            low = mid + 1;
            mid = (low + high)/2;
          }
          if(low > high){ //this was a breakthrough!!! 
            binaryS = false;
          }
        }

      //Print out the values of lo:mid:hi for each call
      //System.out.println(low + ":" + mid + ":" + high);
        
      }
      return -1; //when the value is not in data 
    }
    
    /**
       Implement a RECURSIVE binary search as specified by the comments     
       This algorithm only works on sorted ArrayLists.
    */

    public int binarySearchRecursive(int value, int lowIndex, int highIndex){ //making use of recursion fot this method

	    
	
	    return 0;
	    
    }
    
	
    public String toString(){
	    return ""+ data;
    };


    public void builtinSort(){
	    Collections.sort(data);
	
    }
    
  //helper method 
  public int size(){
    return data.size();
  }

  /* Merge Sort Stuff after here */
    /**
       Builds and returns an ArrayList that's already in increasing order.
       You can use this method to test your merge method.
    */
    public ArrayList<Integer> buildIncreasingList(int size){
    	ArrayList<Integer>  newlist = new ArrayList<Integer>();
    	Random r = new Random();
    	int nextval = r.nextInt(20)+1;
    	for (int i=0;i<size;i++){
    	    newlist.add(nextval);
    	    nextval = nextval + r.nextInt(20);
    	}
    
    	return newlist;
	  }

    /**
       this routine should create and return a new ArrayList of
       integers and fill it by merging list1 and list2 into the new
       list.
       list1 and list2 are already sorted in increasing order.
       Example:
       If list1 contains [1,5,17,25]
       and list2 contains [3,6,10,30,40,50]
       The new list will contain:
       [1, 3, 5, 6, 10, 17, 25, 30, 40, 50]
       
    */

   public ArrayList<Integer> merge(ArrayList<Integer> list1,
				    ArrayList<Integer> list2){ //Z's code
    	ArrayList<Integer> merged = new ArrayList<Integer>(); 
    
    	// keep looking at the first items of list1 and list2
    	// taking the smaller for result
    	// until we're done.
    
    	while(list1.size()>0 && list2.size()>0){
    	    if (list1.get(0) < list2.get(0)){
    		// copy list1's fist to merged
    		// and remove it from list1
    		merged.add(list1.get(0));
    		list1.remove(0);
    			   
    	    } else {
    		// copy list2's first to merged
    		// and remove it from list2
    		merged.add(list2.get(0));
    		list2.remove(0);
    	    }
    	    
    	}
    
    	// At this point, list1 or list2 will be empty
    	// but the OTHER one will have one or more
    	// items to copy.
    
    	// this will be true until
    	// list one is empty
    	while (list1.size()>0){
    	    merged.add(list1.get(0));
    	    list1.remove(0);
    	}
    
    	// this will be true until
    	// list two is empty
    	while (list2.size() > 0){
    	    merged.add(list2.get(0));
    	    list2.remove(0);
    	}
    	
    	return merged;
    }

  public ArrayList<Integer> mergeSort(ArrayList<Integer> list){

      ArrayList<Integer> result = new ArrayList<Integer>();
    
      // check for base case
      if (list.size() < 2){
        return list;
      } else {
        ArrayList<Integer> left = new ArrayList<Integer>();
        ArrayList<Integer> right = new ArrayList<Integer>();

        int mid = list.size()/2;

        for(int i = 0; i < list.size(); i++){
          if (i < mid){
            left.add(list.get(i));
          } else{
            right.add(list.get(i));
          }
        }

        left = mergeSort(left);
        right = mergeSort(right);

        
        result = merge(left, right);
        
      }

      return result;

      // if not the base case
      // split in two lists
      // meregSort the left half
      // mergeSort the right half
      // merge them together into a new list
      // return that new list 

  }


  public void msort(){
    System.out.println(data);  
    data =  mergeSort(data);
    System.out.println(data); 
  }
    
}
