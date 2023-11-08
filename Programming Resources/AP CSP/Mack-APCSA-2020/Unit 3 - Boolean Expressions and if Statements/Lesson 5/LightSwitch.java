// This program introduces the ! (not) 
// operator, which lets you take the
// opposite of a boolean value. Here
// we simulate a light switch.
public class LightSwitch
{
    public static void main(String args[])
    {
        boolean lightOn = true;
    	System.out.println("Light on? " + lightOn);
    	lightOn = !lightOn;	
    	System.out.println("Light on? " + lightOn);
    	lightOn = !lightOn;	
    	System.out.println("Light on? " + lightOn);
    }
}