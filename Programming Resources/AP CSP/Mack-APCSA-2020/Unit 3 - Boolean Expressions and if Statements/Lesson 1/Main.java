public class Main
{
    public static void main(String[] args)
    {
        /*When we assign a string value to the string variable, Java will check
        if the string with the equal value already present in the string pool 
        or not. If it is not present in the string pool, it will be added to
        the constant pool and the reference to that string object is returned.
        */
        String literal = "Test!";
        
        /*If a String is present in the string pool, the reference to the memory 
	    address of that string object is returned. In this case, because "Test!"
	    has already been added to the pool on line 10, the String anotherLiteral
	    references the existing call to the String object "Test!" */
	    String anotherLiteral = "Test!";
	    
	    /*The first comparison is true because both variables reference the same 
	    String object in memory. */
	    System.out.println("Java Pool Reference using ==: " + (anotherLiteral == literal));
	    //The second is true because the value of both Strings is the same.
	    System.out.println("Java Pool Reference using equals: " + anotherLiteral.equals(literal));
	    
	    
	    /*If a new String is created with the keyword new, the new String is stored
	    separately in the heap*/
	    String strObject = new String("Test!");
	   
    	/*The first comparison is false because the two variables reference different
    	String objects */
    	System.out.println("Using ==: " + (literal == strObject));
    	
    	//The second is true because the content of both String objects is the same.
	    System.out.println("Using equals: " + literal.equals(strObject));
    }
}