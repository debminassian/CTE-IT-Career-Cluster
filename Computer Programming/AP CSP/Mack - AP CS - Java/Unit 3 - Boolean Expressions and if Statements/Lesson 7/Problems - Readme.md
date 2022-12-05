# Example: Comparing Strings
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

ComparingStrings

# Example: Comparing Rectangles
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

Rectangle
ComparingRectangle

# Example: Null Test
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

NullTest

# Problem 1 - Comparing Circles
This program is incorrectly comparing Circles using `==`.

Modify the `CircleTester` class to correctly compare Circle objects using `.equals`

You’ll need to implement the following methods in the `Circle` class so that the `CircleTester` can correctly compare and print `Circle`s:
```
public String toString()
public boolean equals(Circle other)
```
equals should only return true if both Circles have the exact same attributes (color, radius, x, and y). toString should return a `String` of the form `[color] circle with a radius of [radius] at position ([x], [y])`.

For example:
```
Circle circle = new Circle(10, "blue", 50, 40);
System.out.println(circle);
```
Should print out
```
blue circle with a radius of 10 at position (50, 40)
```