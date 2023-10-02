# Example: Light Switch
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

LightSwitch

# Example: Number in Range
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

Hours

# Example: Pizza Slices
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

PizzaSlices

# Problem 1 - Divisibility
This program reads in two numbers from the user, dividend and divisor, and prints out whether dividend is evenly divisible by divisor.

For example, one run of the program may look like this:
```
Enter the dividend: 10
Enter the divisor: 5
10 is divisible by 5!
```

Because 5 goes into 10 twice. 10 is evenly divisible by 5.

Another run may look like this:
```
Enter the dividend: 10
Enter the divisor: 8
10 is not divisible by 8!
```
Because 10 / 8 is 1.25, 10 is not evenly divisible by 8.

**The Bug**:
The problem is that if the user inputs 0 for the divisor, the program tries to divide by 0 and the program crashes.

**Your Job**:
Your job is to use Short Circuiting to prevent the condition inside the if statement from dividing by 0.

Your program should be able to produce the following output:
```
Enter the dividend: 10
Enter the divisor: 0
10 is not divisible by 0!
```