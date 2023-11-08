# Problem 1 - Exploring Binary Searches

The Binary Search algorithm works by testing a mid-point, then eliminating half of the list.

In this exercise, you are going to take our binary search algorithm and add print statements so that you can track how the search executes.

Inside of the recursive binary search function, add print statements to print out the starting, ending, and midpoint values each time.

Then as you test a value, print out the results, either too high, too low, or a match.

## Sample Output
Starting value: 0
Ending value: 9
Testing midpoint value: 4
Too high!

Starting value: 0
Ending value: 3
Testing midpoint value: 1
Too low!

Starting value: 2
Ending value: 3
Testing midpoint value: 2
Match!

# Problem 2 - Comparing Binary Search and Linear Search

In this exercise you will compare binary search and linear (or sequential) search.

We have included the algorithms for you, however right now the method returns the index value where the number is found.

What you need to do in this problem is modify each method to instead return the number of times each goes through the loop.

Then you can test out the results on lists of different sizes. We have provided a helper method to generate a list of a certain size.

Be sure to test at least 5 different size arrays!