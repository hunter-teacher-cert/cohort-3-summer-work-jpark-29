import java.util.ArrayList;


//***************************This is lecture notes*********************
public class Test{
    public static void main(String[] args){
        ArrayList <String> words = new ArrayList<String>();
        //this will not print 15 0s since they're not meaningful data
        ArrayList <String> words1 = new ArrayList<String>(15);

        //adding
        words.add("fish1");
        words.add("fish2");
        words.add("fish3");
        words.add(1,"somethingelse"); //overloaded method - this is inefficient in a way that you need to move over everything to the right when you add an item in the beginning of the ArrayList

        System.out.println(words);

        System.out.println(words.get(0));
        //set() is replacing the item in the index whereas add() is just adding a new item
        words.set(0,"notFish");
        words.add("anotherNotfish");
        System.out.println(words.get(0));
        System.out.println(words);
        //size()-1 is the index of the last element 
        System.out.println(words.get(words.size()-1));
    }
}