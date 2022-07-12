

public class introtoStrings {

    public static void main(String[] args) {
/*
        // Go through the first word character by character without displaying anything
        
        // Precondition: someString does not begin with spaces. Words are separated by spaces.
        // Thus, someString in position 0 is not a space char.
        int i = 0;
        String someString = "The dog barks.";
        
        while ( someString.charAt(i) != ' ') {
          i++ ;
        }
       
        // Postcondition: someString in position i IS a space.
        // Go through all the spaces after the first word
        
        while (someString.charAt(i) == ' ') {
          i++ ;
        }
        
        // Postcondition: someString in position i IS NOT a space.
        // Go through the second word character by character and display each character.
        // Precondition: someString[ i ] is the first letter of the second word
        
        while (someString.charAt(i) != ' ') { // This only works for sentences of three words or more. Try to fix it! 
            System.out.print( someString.charAt(i));
            i++ ;
        }
        
*/
        int theArray[] = new int[] {75, 15, 25, 50, 3}; //we’re removing 15
        int currSize = theArray.length;
        for( int i = 1; i < theArray.length - 1; i ++){
	        theArray[i] = theArray[i + 1]; //we’re putting 25 in the position of 15, 50 in the position of 25 and so on…
        }
        for( int i = 1; i < theArray.length - 1; i ++){
	        System.out.println(theArray[i]);
        }
        currSize = currSize - 1; //even though we may have 5 positions, we only care about the length of the array with the data in it. 

    }
    
}