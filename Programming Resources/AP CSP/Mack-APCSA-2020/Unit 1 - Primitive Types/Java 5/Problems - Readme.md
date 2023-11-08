# Example: Increase/Decrease by 1 (User Input)
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

# Example: int Before String
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

# Problem 1 - My Age (User Input)
Refer to your code from the previous My Age exercise. Modify it using the Scanner class to take user input instead of hard coding in your age.

For reference, the instructions are listed below again. Remember to use user input instead of hard coding a value for `age` this time.

Using only one variable called age and the increment and decrement operators, produce the output for your current and upcoming age next year.
Sample output:
```
Please enter your current age: 
My current age is: 14
My age next year will be: 15
My current age is: 14
```

# Problem 2 - MLA Citation
When you distribute information you found from another source, you must always cite your source.

The MLA format for a formal citation for a book is as follows:
```
Last name, First name of author. Title of the Book.
Publisher, Year of publication.
```
Write a citation generator. Your program should ask for

- The author’s name in the form “Last Name, First Name”
- The title of the book
- The publisher
- The date the book was published

Then print out the information in the format shown above. Pay attention to the periods and commas!

Here is an example output:
```
Enter the author's name as 'Last name, First name': 
Collins, Suzanne
Enter the title of the book: 
The Hunger Games
Enter the publisher of the book: 
Scholastic
Enter the year the book was published: 
2008
Collins, Suzanne. The Hunger Games.
Scholastic, 2008.
```
# Example - Casting
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

# Problem 3 - Casting to an Int
Write a program that:

1. Asks the user for a `double` variable called `myDouble` with a decimal value
2. Casts the `double` value to an int
3. Prints the `int` value to the screen

**NOTE**: Your job is to print the `int` casted version of the `double`.

# Example: Casting Order of Operations
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

# Example: Casting Order of Operations
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

# Problem 4 - Movie Ratings
Movies always come with ratings. A bad movie may have 1.4 stars, and a great movie may have 4.9 stars.

Your job is to write a program that asks the user for a movie rating as a double, and then rounds to the nearest int using the rounding with casting technique.

For example, a run of your program may look like this:
```
Enter movie rating (as a decimal)
1.4
Rating rounded: 1
```
Another run may look like this:
```
Enter movie rating (as a decimal)
3.7
Rating rounded: 4
```
If the initialized value has a decimal place of .5 or greater, you should round up:
```
Enter movie rating (as a decimal)
3.5
Rating rounded: 4
```
**HINT:**
To see how you can use casting to round double values to the nearest int value, refer to the previous example Rounding using Casting.

# Example: Implicit Casting
**Implicit casting (widening conversion)**

A data type of lower size (occupying less memory) is assigned to a data type of higher size (more memory). This is done implicitly by the Java Virtual Machine, unlike the explicit casting we did in previous examples (so by the programmer). The lower size is widened to a higher size. This is also called automatic type conversion.
```
Example:

        int x = 10;                    // occupies 4 bytes
        double y = x;                  // occupies 8 bytes
        System.out.println(y);         // prints 10.0
```
In the above code, the 4 bytes integer value is assigned to 8 bytes double value.

# Problem 5 - Integer Overflow
If an expression would evaluate to an `int` value outside of the allowed range, an integer overflow occurs. This could result in an incorrect value within the allowed range.

In this program you will test for underflow and overflow in Java by adding 1 to the maximum value and subtracting 1 from the minimum value to see what happens to the output. Your output should include 4 items:

- The minimum value for an integer.
- The maximum value for an integer.
- The minimum value subtracted by 1.
- The maximum value with 1 added.

What do the last two lines print out? Did this surprise you? What do you think it happening here?

**NOTE:** Refer back to the previous example on Min and Max Values of Integers if you need to.