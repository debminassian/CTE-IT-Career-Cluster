public class Person2 
{
    
	private String name;
	private String birthday;

    public Person2 (String name, String birthday)
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
     
    @Override
    public String toString()
    {
        return "Name: " + name + "\nBirthday: " + birthday;
    }
}
