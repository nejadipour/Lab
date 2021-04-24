/**
 * information related to triangles is stored here
 * @author Alireza Nejadipour
 * @version 1.2
 */

public class Triangle extends Polygon
{

    /**
     * create a new triangle with passed parameters
     * @param firstAngle first side
     * @param secondAngle second side
     * @param thirdAngle third side
     */
    public Triangle(int firstAngle, int secondAngle,
                    int thirdAngle)
    {
        super(firstAngle, secondAngle, thirdAngle);

    }

}
