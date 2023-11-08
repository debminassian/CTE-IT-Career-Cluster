public class RectangleTester 
{
    public static void main(String[] args)
    {
        /*
         * Rectangle is the name of the class. Every Rectangle
         * has a width and a height. But the specific instances
         * have their own dimensions.
         */
         Rectangle r1 = new Rectangle(10, 2);
         System.out.println(r1);
         
         System.out.print("Area of r1: ");
         r1.printArea();
         
         // Rectangle is the class and also the type of this object.
         Rectangle r2 = new Rectangle(5, 15);
         System.out.println(r2);

         System.out.print("Area of r2: ");
         r2.printArea();

    }
}
