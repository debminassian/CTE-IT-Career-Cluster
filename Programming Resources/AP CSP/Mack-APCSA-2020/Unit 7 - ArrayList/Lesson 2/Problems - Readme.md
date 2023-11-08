# Problem 1 - Teacher Class List
A teacher wants to create a list of students in her class.

Using the existing `Student` class in this exercise. Create a static ArrayList called `classList` that adds a student to the `classList` whenever a new `Student` is created.

In the constructor, you will have to add that Student to the ArrayList.

# Problem 2 - Teacher Class List Methods
Now that the `classList` Array has been implemented, we need to create methods to access the list items.

Create the following static methods for the `Student` class:

- getLastStudent() - returns the name of the last student in the `classList` array.
- getClassSize() - returns the size of the `classList`
addStudent(int index, Student student) - adds a new `student` to the `classList` at index index. This method is a little tricky - when the new `Student` is added to the class, it will create a duplicate value at the end of the classList because of our `Student` constructor. This method should also include a command to remove the extra `Student` in the `classList` added to the end.
- getStudent(int index) - returns the name of a student at the index specified.