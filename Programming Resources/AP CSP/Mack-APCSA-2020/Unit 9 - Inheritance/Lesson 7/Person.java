public class Person 
{
    
	private String name;
	private String birthday;

    public Person (String name, String birthday)
    {
    	this.name = name;
    	this.birthday = birthday;
    }

    public String getName()
    {
    	return name;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    /**
     * Since the object class has a toString, the Person
     * class toString is technically an Override
     */
     
    @Override
    public String toString()
    {
        return "Name: " + name + "\nBirthday: " + birthday;
    }
}
