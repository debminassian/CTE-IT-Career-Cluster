# Problem 1 - Manipulating 2D Arrays

The last element in each array in a 2D array is incorrect. It’s your job to fix each array so that the value 0 is changed to include the correct value.

In the first array, the final value should be the length of the first array.

In the second array, the final value should be the sum of the first value, and the second to last value in the array.

In the third array, the final value should be the length of the 2D array.

Create a method called `fixArray(int[][] array, int row, int col, int value)` that sets the `[row][column]` to the correct value. Then, call the `fixArray` method three times - once for each value change that you are supposed to make.

When inputting values to `fixArray`, you will have to hard code the row value, but the column value and the new value should be set using the array accessor methods. For example, if we wanted to set the value of the first index in the first array to the length of the 2D array, we would write:

`fixArray(array, 0, 0, array.length)`

# Problem 2 - Complete Chessboard

n this exercise, you will create a full 8x8 chess board.

First, initialize an 8x8 2D String array. Then, populate the first and last array in the 2D array with the correct chess pieces. The rest of the arrays should be filled with Strings with the value `"-"`.

When printed using the provided method, the result should look like:

`Rook  Knight  Bishop  Queen  King  Bishop  Knight  Rook`  
`Pawn   Pawn    Pawn   Pawn   Pawn  Pawn    Pawn    Pawn `
`  -      -      -      -      -      -      -      -    `
`  -      -      -      -      -      -      -      -    `
`  -      -      -      -      -      -      -      -    `
`  -      -      -      -      -      -      -      -    `
`Pawn   Pawn    Pawn   Pawn   Pawn  Pawn    Pawn    Pawn  `
`Rook  Knight  Bishop  Queen  King  Bishop  Knight  Rook  `