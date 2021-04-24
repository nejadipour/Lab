import java.util.ArrayList;

/**
 * all shapes are stored in list here
 * @author Alireza Nejadipour
 * @version 2.4
 */

public class Paint
{
    private final ArrayList<Shape> shapes;

    /**
     * create a new paint
     */
    public Paint()
    {
        shapes = new ArrayList<>();

    }


    /**
     * adds shape to the list
     * @param shape the shape that should be added to shapes
     */
    public void addShape(Shape shape)
    {
        shapes.add(shape);

    }


    /**
     * draw all the shapes in the list
     */
    public void drawAll()
    {
        for (Shape shape : shapes)
        {
            shape.draw();

        }

    }


    /**
     * prints all the shapes available
     */
    public void printAll()
    {
        for (Shape shape : shapes)
        {
            System.out.println(shape.toString());

        }

    }


    /**
     * iterates through the shapes and if it finds square or equilateral triangle prints it
     */
    public void describeEqualSides()
    {
        for(Shape shape : shapes)
        {
            if (shape instanceof Polygon && ((Polygon) shape).equalSides())
            {
                System.out.println(shape.toString());

            }

        }

    }

}
