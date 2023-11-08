import java.util.ArrayList;
public class ArrayListInit
{
    public static void main(String[] args)
    {
        //ArrayLists can only be initialized with Object data types.
        // This will cause an error because we are attempting to create an ArrayList with primitive type int.
        ArrayList<int> array = new ArrayList<int>();
        
        //Comment out the code above, and uncomment the code below to create a working ArrayList!
        // ArrayList<Integer> array = new ArrayList<Integer>();
        
        //We can also create an ArrayList without specifying the type
        //This is NOT RECOMMENDED because any errors made to the type will NOT be
        //discovered until after runtime.
        ArrayList arrayWithoutAType = new ArrayList();
        System.out.println("Congrats! You created an ArrayList!");
    }
}
