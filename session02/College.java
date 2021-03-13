/**
 * This is a college
 * @author Alireza
 * @version 1
 */

public class College
{
    // name of college
    private String name;

    // an array of labratories
    private Lab[] labs;

    // average of all students' grades!
    private int avg;

    // the number of labs the college support
    private int capacity;

    // the number of labs in the college
    private int labNum;


    /**
     * Create a new lab with given capacity and day
     *
     * @param capacity capacity of labratory
     * @param name the name of college
     */
    public College(int capacity, String name)
    {
        this.capacity = capacity;

        labNum = 0;

        labs = new Lab[this.capacity];

        this.name = name;

    }


    /**
     * the method that adds lab to college
     * @param newlab new lab that will be added to labs' array
     */
    public void addLab(Lab newlab)
    {
        if (labNum < capacity)
        {
            labs[labNum] = newlab;
            labNum++;
        }
        else
        {
            System.out.println("College is Full!!!");
        }

    }


    /**
     * Print list of all labrotories
     */
    void print()
    {
        calculateAvg();

        System.out.println("College Name : " + getName());
        System.out.println("College Capacity : " + getCapacity() + "Labs");
        System.out.println("College Number of Labs : " + getLabNum());

        for (int i = 0 ; i < labNum ; i++)
        {
            System.out.println("Labratory Number " + (i + 1) + ":");
            labs[i].print();
            System.out.println("____________________________________________________");
        }

        System.out.println("All Students of College's Average : " + getAvg());

    }


    /**
     * calculate the average of all students!
     */
    public void calculateAvg()
    {
        int totalSum = 0;
        int totalNum = 0;

        for (int i = 0 ; i < labNum ; i++)
        {
            labs[i].calculateAvg();
            totalSum += (labs[i].getAvg() * labs[i].getCurrentSize());
            totalNum += labs[i].getCurrentSize();
        }

        avg = totalSum / totalNum;
    }



    /**
     * get the name of college
     * @return name field
     */
    public String getName()
    {
        return name;
    }

    /**
     * get the labs of college
     * @return labs field
     */
    public Lab[] getLabs()
    {
        return labs;
    }


    /**
     * get the average of college
     * @return avg field
     */
    public int getAvg()
    {
        return avg;
    }


    /**
     * get the capacity of college
     * @return capacity field
     */
    public int getCapacity()
    {
        return capacity;
    }


    /**
     * get the number of labs in the college
     * @return labNum
     */
    public int getLabNum()
    {
        return labNum;
    }


    public void setAvg(int avg)
    {
        this.avg = avg;
    }


    /**
     * @param capacity set college's capacity
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    /**
     * @param labNum set college's number of current labs
     */
    public void setLabNum(int labNum)
    {
        this.labNum = labNum;
    }


    /**
     * @param labs add a lab to labratories
     */
    public void setLabs(Lab[] labs)
    {
        this.labs = labs;
    }

    /**
     * @param name set the name of college
     */
    public void setName(String name)
    {
        this.name = name;
    }
}
