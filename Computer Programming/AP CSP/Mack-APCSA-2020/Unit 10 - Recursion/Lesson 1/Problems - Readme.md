# Problem 1 - Factorial

For this problem, you are going to write a recursive function to calculate the factorial of a number. Remember, factorial is the product of an integer and all the integers below it. This function should be similar to the summing example we looked at earlier.

**Note**: Make sure you enter small numbers to test. Factorial will overflow the int value very quickly!

# Problem 2 - Recursive Minimum

Write a recursive function that finds the minimum value in an ArrayList.

Your function signature should be

`public static int findMinimum(ArrayList<Integer>)`

One way to think of finding a minimum recursively is to think “the minimum number is either the last element in the ArrayList, or the minimum value in the rest of the ArrayList”.

For example, if you have the ArrayList

`[1, 3, 2, 567, 23, 45, 9]`

the minimum value in this ArrayList is either 9 or the minimum value in [1, 3, 2, 567, 23, 45]

**Hint:**
- The trick is to remove the last element each time to make the ArrayList a little shorter.

# Problem 3 - Bacteria Cultures

A chemistry teacher asked her class to answer the following question:

`If I put 10 bacteria on the classroom doorknob tonight, how many bacteria will be on the doorknob by the time we come to school tomorrow?`

In order to answer this question, you need to know a few things:

1. Each bacterium (a single bacteria) can create 2 more bacteria every hour
2. This means that after one hour, the doorknob will have 10 + 10 * 2 = 30 bacteria, since we started with 10 bacteria and each of those created 2 more.
3. This means that after two hours, the doorknob will have 30 + 30 * 2 = 90, since there were 30 bacteria at the beginning of hour two, and during that hour each bacteria created 2 more bacteria.
4. Continuing this pattern, the number of bacteria on the doorknob after N hours is
`numberOfBacteriaLastHour + numberOfBacteriaLastHour * 2`
5. However, if we wanted to know how many bacteria are alive after 12 hours, we need to know how many bacteria were alive at hour 11. To find out how many bacteria are alive at hour 11, we need to figure out how many were alive at hour 10. Do you see how we can use recursion to solve this problem?

Write a recursive function that computes the number of bacteria alive after N hours.
The function signature is

`public static int numBacteriaAlive(int hour)`