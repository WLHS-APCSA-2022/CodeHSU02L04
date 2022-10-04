public class RectangleTester 
{
    public static void main(String[] args)
    {
        /*
         * Rectangle is the name of the class. Every Rectangle
         * has a width and a height. But the specific instances
         * have their own dimensions.
         */

        //Make a rectangle called r1 with a width of 10 and height of 2 then print it
        Rectangle r1 = new Rectangle(10,2);
        System.out.println(r1);
        //print just the area of the rectangle
        r1.printArea();

        // Rectangle is the class and also the type of this object.
        // Make a new rectangle called r2 with a width of 5 and height of 15, print it, then print just its area
        Rectangle r2 = new Rectangle(5,15);
        System.out.println(r2);
        r2.printArea();
    }
}
