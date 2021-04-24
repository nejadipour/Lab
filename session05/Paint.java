import java.util.ArrayList;

/**
 * all shapes are stored in list here
 * @author Alireza Nejadipour
 * @version 2.4
 */

public class Paint
{
    private final ArrayList<Triangle> triangles;
    private final ArrayList<Circle> circles;
    private final ArrayList<Rectangle> rectangles;

    /**
     * create a new paint
     */
    public Paint()
    {
        this.triangles = new ArrayList<>();
        this.circles = new ArrayList<>();
        this.rectangles = new ArrayList<>();

    }


    /**
     * adds triangle to the list
     * @param triangle the shape that should be added to shapes
     */
    public void addTriangle(Triangle triangle)
    {
        triangles.add(triangle);

    }


    /**
     * adds circle to the list
     * @param circle the shape that should be added to shapes
     */
    public void addCircle(Circle circle)
    {
        circles.add(circle);

    }


    /**
     * adds rectangle to the list
     * @param rectangle the shape that should be added to shapes
     */
    public void addRectangle(Rectangle rectangle)
    {
        rectangles.add(rectangle);

    }


    /**
     * draw all the shapes in the list
     */
    public void drawAll()
    {
        for (Triangle triangle : triangles)
        {
            triangle.draw();

        }

        for (Circle circle : circles)
        {
            circle.draw();

        }

        for (Rectangle rectangle : rectangles)
        {
            rectangle.draw();

        }

    }


    /**
     * prints all the shapes available
     */
    public void printAll()
    {
        for (Triangle triangle : triangles)
        {
            System.out.println(triangle.toString());

        }

        for (Circle circle : circles)
        {
            System.out.println(circle.toString());

        }

        for (Rectangle rectangle : rectangles)
        {
            System.out.println(rectangle.toString());

        }

    }

}
