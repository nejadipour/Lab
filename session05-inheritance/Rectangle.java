/**
 * information related to rectangles is stored here
 * @author Alireza Nejadipour
 * @version 1.2
 */

public class Rectangle extends Polygon
{
    /**
     * create a new rectangle with passed parameters
     * @param firstAngle first side
     * @param secondAngle second side
     * @param thirdAngle third side
     * @param fourthAngle fourth side
     */
    public Rectangle(int firstAngle, int secondAngle,
                     int thirdAngle, int fourthAngle)
    {
        super(firstAngle, secondAngle, thirdAngle, fourthAngle);

    }


    /**
     * calculates the area of rectangle
     * @return the area
     */
    @Override
    public double calculateArea()
    {
        int a = getSides().get(0);
        int b = getSides().get(1);
        int c = getSides().get(2);

        if (a != b)
            return a * b;
        else
            return a * c;

    }

}
