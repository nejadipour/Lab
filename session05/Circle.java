/**
 * this class stores details related to circles
 * like radius
 * @author Alirzea Nejadipour
 * @version 1.4
 */

public class Circle
{
    int radius;

    /**
     * create a new circle with passed parameters
     * @param radius the radius of the circle
     */
    public Circle(int radius)
    {
        this.radius = radius;

    }


    /**
     * calculates the perimeter of circle
     * @return the perimeter
     */
    public double calculatePerimeter()
    {
        return 2 * Math.PI * radius;

    }


    /**
     * calculates the area of circle
     * @return the area
     */
    public double calculateArea()
    {
        return Math.PI * Math.pow(radius, 2);

    }


    /**
     * the draw method is used to print details of the shape
     * like the type, perimeter and area
     */
    public void draw()
    {
        System.out.println("type : circle, perimeter : " + calculatePerimeter() + ", area : " + calculateArea());

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
        Circle circle = (Circle) o;
        return radius == circle.radius;

    }


    /**
     * convert all data of the shape to a string
     * @return the string that is made is returned
     */
    @Override
    public String toString()
    {
        return "Circle:: radius: " + getRadius();

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
