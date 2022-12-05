public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[][] array = {{5, 4, 2, 1, 0}, {523, 63, 2342, 586, 1, 6534, 0}, {10, 9, 2, 0}};
        //Call the fixArray method three times on this array:
        
        
        
        print(array);
    }
    
    //Create a method to add the correct value to the array at the correct col, row
    public static void fixArray(int[][] arr, int row, int col, int value)
    {
        
    }
    
    
    
    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
