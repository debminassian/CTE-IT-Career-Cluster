package Lesson 3;

public class TraverseExample {
    public static void main(String[] args)
    {
        String print = "Print Me!";

        for(int i = 0; i < print.length(); i++)
        {
        	System.out.println(print.substring(i, i+1));
        }

    }
}
