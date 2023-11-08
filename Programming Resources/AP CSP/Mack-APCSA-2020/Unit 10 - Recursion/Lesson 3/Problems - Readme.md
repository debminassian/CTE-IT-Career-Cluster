# Problem 1 - Explore Merge Sort

Mergesort is a complicated process, but what is it actually doing? We are going to take a closer look at the process in this exercise.

You are given the merge sort algorithm and you need to add some print statements so that you can see what actually is happening.

Add a print statement at each step, as well as print out the array each time. Your output needs to match the sample below. Here is a portion of a sort as an example:

Unsorted: 5 3 4 1 6 9 2 7

Splitting ...
*** Left: 5 3 4 1
*** Right: 6 9 2 7

Splitting ...
*** Left: 5 3
*** Right: 4 1

Splitting ...
*** Left: 5
*** Right: 3

Merging ...
*** Current: 3 5
...

Merging ...
*** Current: 2 6 7 9

Merging ...
*** Current: 1 2 3 4 5 6 7 9

Sorted: 1 2 3 4 5 6 7 9

# Problem 2 - Merge Sort Benchmark Testing

So how fast is the merge sort? Does it depend on the type of array? We saw with some of our previous sorts that it depended on the initial array. For example, an Insertion sort was much faster for a nearly sorted array.

In this exercise, you are given the Sorter class, which contains a static mergeSort method that takes an int array and length as an input. You are also given the SortTester class which has three static methods for creating 3 different types of arrays.

For this test, create one of the three arrays, then take a start time using System.currentTimeMillis(). Next, run the array through the mergeSort method in the Sorter class. Finally, record the end time and print out the results.

Repeat this for the other two array types.

Sample Output
Random Array: ** Results Hidden **
Almost Sorted Array: ** Results Hidden **
Reverse Array: ** Results Hidden **

# Problem 3 - Recursive Calls

We learned in this lesson that Merge Sorts are recursive. One of the favorite topics that College Board likes to ask is how many times a recursive method is called. With that in mind, let’s figure out how many times our recursive method is called for a given merge sort.

For this exercise, you are given the mergeSort and the makeRandomArray helper methods. Using the static count variable, add an incrementer in the mergeSort method to count how many times it is called.

Then, in the main method, create a random array of sizes 100, 1000, 10k, and 100k. Run the array through the sort and print out the results of the counter. Don’t forget to reset the counter between runs!

You should pay attention to the pattern that you see. Does this pattern surprise you?

Sample Output
Total Recursive calls for 100: ** Results Hidden **
Total Recursive calls for 1000: ** Results Hidden **
Total Recursive calls for 10000: ** Results Hidden **
Total Recursive calls for 100000: ** Results Hidden **

**Challenge**: See if you can write this with a loop!

# Problem 4 - Sort Benchmark Testing

We saw that a merge sort performs roughly the same depending on the type of array we have. For this last exercise, we want to see how the merge sort performs against other sorts.

We are using the same two classes that we used a couple of lessons ago. This time the Sorter class has three public methods: mergeSort, insertionSort, and selectionSort. You are also given the SortTester class which has three static methods for creating 3 different types of arrays, random, nearly sorted, and reverse sorted.

This test is going to be similar to the previous one, but instead of testing three different types of arrays, you are going to test 3 different types of sorts on the same array type. Create an array using the makeRandomArray method, then take a start time using System.currentTimeMillis(). Next, run the array through one of the sort methods in the Sorter class. Finally, record the end time. Subtract the start time from the end time and print out the results.

You will test each of the 3 sorts.

Feel free to also test this with other array types. Is the fastest sort always the same?

Sample Output
Selection Sort: ** Results Hidden **
Insertion Sort: ** Results Hidden **
Merge Sort: ** Results Hidden **

**Note: Keep the array size at 20k or less. Otherwise the program will take too long to return.**