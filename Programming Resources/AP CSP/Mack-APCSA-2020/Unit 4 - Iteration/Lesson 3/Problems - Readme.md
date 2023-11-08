# Example: Traversing Strings
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

TraverseExample

# Example: Replace Characters
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

ReplaceCharsExample

# Example: Reverse String
This is an example for this lesson. You are encouraged to play around with it, run and change the code, and learn how it works. When you are done, click continue to go to the next problem.

ReverseExample

# Problem 1 - Replace Letter
A programmer has written a method called `replaceLetter` that counts the amount of times a letter is present in a word. Your job is to modify this existing method to fulfill a new purpose.

Rather than count the instances of a letter in a String, write a program that replaces all instance of one letter with another. You should directly modify `replaceLetter` to get this program to work. In the starter code, `replaceLetter` only has two parameter values. Your new version should have a third parameter to indicate which String value is replacing the existing letter.

For example,
```
replaceLetter("hello", "l", "y")
```
returns
```
"heyyo"
```
Sample output:
```
Enter your word: 
hello

Enter the letter you want to replace: 
l

Enter the replacing letter: 
x
hexxo
```
**Hint**: The letters will be assigned from the user as String values. Make sure to use String methods to compare them!

# Problem 2 - Finding Palindromes
A palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

In this program, ask the user to input some text and print out whether or not that text is a palindrome.

Create the Boolean method `isPalindrome` which determines if a String is a palindrome, which means it is the same forwards and backwards. It should return a boolean of whether or not it was a palindrome.

Create the method `reverse` which reverses a String and returns a new reversed String to be checked by `isPalindrome`.

Both methods should have the signature shown in the starter code.

Sample output:
```
Type in your text: 
madam
Your word is a palindrome!
```
OR
```
Type in your text: 
hello
Not a palindrome :(
```