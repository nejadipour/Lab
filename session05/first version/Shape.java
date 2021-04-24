import java.util.ArrayList;
import java.util.Objects;

/**
 * this is the super class that stores data of all kind of shapes
 * with methods that every shape needs
 * @author Alireza Nejadipour
 * @version 1.8
 */

public class Shape
{
    protected ArrayList<Integer> sides;

    /**
     * create a new shape
     */
    public Shape()
    {
        sides = new ArrayList<>();

    }


    /**
     * calculates the perimeter of shapes
     * @return the perimeter
     */
    public double calculatePerimeter()
    {
        double perimeter = 0;

        for (int side : this.sides)
        {
            perimeter += side;

        }

        return perimeter;

    }


    /**
     * calculates the area of shapes
     * @return the area
     */
    public double calculateArea()
    {
        int a = sides.get(0);
        int b = sides.get(1);
        int c = sides.get(2);

        double semiPerimeter = (double)(a + b + c) / 2;

        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));

    }


    /**
     * the draw method is used to print details of the shape
     * like the type, perimeter and area
     */
    public void draw()
    {
        String type = "circle";

        if (this instanceof Rectangle)
            type = "rectangle";

        else if (this instanceof Triangle)
            type = "triangle";

        System.out.println("type : " + type + ", perimeter : " + calculatePerimeter() + ", area : " + calculateArea());

    }


    /**
     * convert all data of the shape to a string
     * @return the string that is made is returned
     */
    @Override
    public String toString()
    {
        if (sides.size() == 4)
            return "Rectangle:: " + "side1: " + sides.get(0) + ", side2: " + sides.get(1) + ", side3: " + sides.get(2) + ", side4: " + sides.get(3);
        else
            return "Triangle:: " + "side1: " + sides.get(0) + ", side2: " + sides.get(1) + ", side3: " + sides.get(2);

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
        Shape shape = (Shape) o;
        return Objects.equals(sides, shape.sides);

    }

}
