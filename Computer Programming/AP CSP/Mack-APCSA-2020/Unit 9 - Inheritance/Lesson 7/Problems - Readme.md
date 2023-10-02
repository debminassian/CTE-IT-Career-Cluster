# Problem 1 - Equal?

For this exercise, you are given 3 `Object` class `objects` and 3 `Ball` class objects. In theory, all three Objects are the same and all 3 `Ball` objects are the same, but based on the way they are created and the way that Java evaluates equality, not all three objects will be equal.

Your task is to start by printing out the 6 `Object` and `Ball` objects. Remember, the `Object` class has a toString and since a Ball object extends the `Object` class, we should see similarities between the `Object` and Ball class.

After printing them out, you should notice which objects are the same. Write 2 true and false statements for each group, one using == and one using .equals. Will these be the same?

# Problem 2 - Eqauls? Part 2

In this second exercise, we are going to look at the impact of overriding the equals and toString methods.

Start by copying over your `TestEquals` class from the previous exercise. You will not need to make any changes to this code.

Instead, you are going to add the following methods to your Ball class:

`public String toString()`
`public boolean equals(Ball other)`