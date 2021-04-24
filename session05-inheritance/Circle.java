/**
 * this class stores details related to circles
 * like radius
 * @author Alirzea Nejadipour
 * @version 1.4
 */

public class Circle extends Shape
{
    int radius;

        /**
         * create a new circle with passed parameters
         * @param radius the radius of the circle
         */
    public Circle(int radius)
    {
        super();
        this.radius = radius;

    }


    /**
     * calculates the perimeter of circle
     * @return the perimeter
     */
    @Override
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;

    }


    /**
     * calculates the area of circle
     * @return the area
     */
    @Override
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);

    }


    /**
     * convert all data of the circle to a string
     * @return the string that is made is returned
     */
    @Override
    public String toString()
    {
        return "Circle:: radius: " + getRadius();

    }


    /**
     * checks if two circles are equal or not
     * @param o the circle that should be compared
     * @return true if shapes are equal
     */
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;

    }


    /**
     * gets the radius of the circle
     * @return the radius field is returned
     */
    public int getRadius()
    {
        return radius;

    }
}
