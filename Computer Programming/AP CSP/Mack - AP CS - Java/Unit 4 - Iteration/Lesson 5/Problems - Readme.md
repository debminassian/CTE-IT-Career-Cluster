# Example: Loop Execution Count
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

LoopExecution

# Example: While Loop Time
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

WhileLoopTime

# Example: For Loop Time
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

ForLoopTime

# Problem 1 - Improving findChar Speed
In the Lesson Slides for this activity, we developed a method `findChar` for figuring out if a character was in a String.

The implementation was:
```
public boolean findChar(String string, String key)
    {
        for(int index = 0; index < string.length(); index++)
        {
            String character = string.substring(index,index+1);
            if(character.equals(key))
            {
                return true;
            }
        }
        return false;
    }
```
However, there is a much more efficient and simple algorithm that we can use to determine if a character is in a String. Using the method signature `public boolean findChar(String string, String key),` figure out a more efficient method with a lower execution count.

**Hint**: We’ve learned a couple of methods that can tell us what index a character is at - can we use those to determine if the character is in a String?

# Example: Improving findChar Speed Check
This example tests the speed of the findChar method that we created in the Lesson Slides to the findChar method that you created in the previous exercise.

Copy the algorithm that you made in the last exercise to the method findChar2 to see how the two methods compare in terms of run-time speed.

findCharTesterImproved