import java.util.ArrayList;
import java.util.Objects;

/**
 * information related to triangles is stored here
 * @author Alireza Nejadipour
 * @version 1.2
 */

public class Triangle
{
    private final ArrayList<Integer> sides;

    /**
     * create a new triangle with passed parameters
     * @param firstAngle first side
     * @param secondAngle second side
     * @param thirdAngle third side
     */
    public Triangle(int firstAngle, int secondAngle,
                    int thirdAngle)
    {
        this.sides = new ArrayList<>();

        this.sides.add(firstAngle);
        this.sides.add(secondAngle);
        this.sides.add(thirdAngle);

    }


    /**
     * checks if all sides are equal to each other
     * @return true if all sides are the same
     */
    public boolean isEquilateral()
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
     * calculates the perimeter of triangle
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
     * calculates the area of triangle
     * @return the area
     */
    public double calculateArea()
    {
        int a = getSides().get(0);
        int b = getSides().get(1);
        int c = getSides().get(2);

        double semiPerimeter = (double)(a + b + c) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

    }


    /**
     * the draw method is used to print details of the shape
     * like the type, perimeter and area
     */
    public void draw()
    {
        String type = "triangle";
        if (isEquilateral())
            type = "equilateral triangle";

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
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);

    }


    /**
     * convert all data of the shape to a string
     * @return the string that is made is returned
     */
    @Override
    public String toString()
    {
        return "Triangle:: " + "side1: " + sides.get(0) + ", side2: " + sides.get(1) + ", side3: " + sides.get(2);

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
