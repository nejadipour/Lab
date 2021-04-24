import java.util.ArrayList;

/**
 * this class stores details related to polygons
 * the shapes with sides
 * @author Alireza Nejadipour
 * @version 2.2
 */

public class Polygon extends Shape
{
    /**
     * create new polygon
     */
    public Polygon(int ... angles)
    {
        super();

        for (int angle : angles)
        {
            this.sides.add(angle);

        }

    }


    /**
     * checks if all sides are equal to each other
     * @return true if all sides are the same
     */
    public boolean equalSides()
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
     * get sides of the polygon
     * @return sides field is returned
     */
    public ArrayList<Integer> getSides()
    {
        return sides;

    }

}
