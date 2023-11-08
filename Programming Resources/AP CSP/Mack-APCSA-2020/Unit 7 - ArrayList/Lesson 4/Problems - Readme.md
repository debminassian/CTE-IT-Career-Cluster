# Problem 1 - ArrayList equals
With Strings, we need to use the equals method to determine if two Strings are the same.

Let’s write an `equals` method for the ArrayList class that returns `true` if two ArrayLists are the same, and `false` if the ArrayLists are not identical. An ArrayList is identical if all of the values at each index are the same.

# Problem 2 - User Data Cleanup
Your company is doing some data cleanup, and notices that the email list of all users has been getting outdated. For one, there are some users with repeat email addresses, and some of the email accounts no longer exist.

Your job is to create a series of methods that can purge some of the old data from the existing email list.

Create static methods in the DataPurge class that can do the following:

- `removeDuplicates` This method takes an email list, and removes the duplicate email values. It also prints to the console which duplicate emails have been removed.
- `removeAOL` This method removes all email addresses from a list that are from aol.com. It notifies the user which email addresses are being removed as well.
- `containsOnlyEmails` This method returns true if all of the data in the email list is actually an email address. We will define something as an email address if it contains the characters `@` and `.`

Test your methods out in the `DataPurgeTester` file. You don’t have to change anything there, but the methods should work accordingly!