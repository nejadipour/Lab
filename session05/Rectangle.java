import java.util.ArrayList;
import java.util.Objects;

/**
 * information related to rectangles is stored here
 * @author Alireza Nejadipour
 * @version 1.2
 */

public class Rectangle
{
    private final ArrayList<Integer> sides;

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
        this.sides = new ArrayList<>();

        this.sides.add(firstAngle);
        this.sides.add(secondAngle);
        this.sides.add(thirdAngle);
        this.sides.add(fourthAngle);

    }


    /**
     * checks if all sides are equal to each other
     * @return true if all sides are the same
     */
    public boolean isSquare()
    {
        int firstAngle = sides.get(0);

        for (int angle : sides)
        {
            if (angle != firstAngle)
            {
                return false;

            }

        }

        return true;

    }


    /**
     * calculates the perimeter of rectangle
     * @return the perimeter
     */
    public double calculatePerimeter()
    {
        double perimeter = 0;

        for (int side : sides)
        {
            perimeter += side;

        }

        return perimeter;

    }


    /**
     * calculates the area of rectangle
     * @return the area
     */
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


    /**
     * the draw method is used to print details of the shape
     * like the type, perimeter and area
     */
    public void draw()
    {
        String type = "rectangle";
        if (isSquare())
            type = "square";

        System.out.println("type : " + type + ", perimeter : " + calculatePerimeter() + ", area : " + calculateArea());

    }


    /**
     * checks if two shapes are equal or not
     * @param o the shape that should be compared
     * @return true if shapes are equal
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(sides, rectangle.sides);

    }


    /**
     * convert all data of the shape to a string
     * @return the string that is made is returned
     */
    @Override
    public String toString()
    {
        return "Rectangle:: " + "side1: " + sides.get(0) + ", side2: " + sides.get(1) + ", side3: " + sides.get(2) + ", side4: " + sides.get(3);

    }


    /**
     * get sides of the polygon
     * @return sides field is returned
     */
    public ArrayList<Integer> getSides()
    {
        return sides;

    }

}
