/**
 * This is a Labratory
 * @author Alireza
 * @version 1
 */

public class Lab
{
    // an array of students
    private Student[] students;

    // the average of students' grades
    private int avg;

    //
    private String day;

    // the number of students the Lab support
    private int capacity;

    // the current number of students in the Lab
    private int currentSize;


    /**
     * Create a new lab with given capacity and day
     *
     * @param cap capacity of labratory
     * @param day the day of week that labratory presents on
     */
    public Lab(int cap, String day)
    {
        capacity = cap;
        this.day = day;
        currentSize = 0;

        students = new Student[capacity];

    }

    /**
     * the method enrolls a student in the labratory
     * @param std new student that will be added to students' array
     */
    public void enrollStudent(Student std)
    {
        if (currentSize < capacity)
        {
            students[currentSize] = std;
            currentSize++;
        }
        else
        {
            System.out.println("Lab is Full!!!");
        }

    }


    /**
     * Print the information of each student. Print the Day of Labratory, Capacity, Current Size and Average of Grades.
     */
    public void print()
    {
        calculateAvg();

//        for (int i = 0; i < students.length ; i++)
//        {
//            if (students[i] == null)
//                break;
//            System.out.println("std fname: " + students[i].getFirstName()
//                    + " std id:" + students[i].getId()
//                    + " std grade:"+ students[i].getGrade());
//        }
//
//        System.out.println("Lab AVG:" + avg);


        System.out.println("**Labratory Information**");

        System.out.println("Day : " + day);
        System.out.println("Capacity : " + capacity);
        System.out.println("Current Size : " + currentSize);
        System.out.println("Average : " + avg);

        System.out.println("Students :");
        for (int i = 0 ; i < currentSize ; i++)
        {
            students[i].print();
        }

    }


    /**
     * Calculate the average of students' grades
     */
    public void calculateAvg()
    {
        int sum = 0;

        for (int i = 0 ; i < currentSize ; i++)
        {
            sum += students[i].getGrade();
        }

        this.avg = sum / currentSize;
    }






    /**
     * get the stdents of Lab
     * @return students field
     */
    public Student[] getStudents()
    {
        return students;
    }


    /**
     * get the average of Labratory
     * @return avg field
     */
    public int getAvg()
    {
        return avg;
    }


    /**
     * get the day of labratory
     * @return day
     */
    public String getDay()
    {
        return day;
    }


    /**
     * get the capacity of labratory
     * @return capacity
     */
    public int getCapacity()
    {
        return capacity;
    }


    /**
     * @param stdlist add a student to students
     */
    public void setStudents(Student[] stdlist)
    {
        students = stdlist;
    }


    /**
     * @param day set labratory's day
     */
    public void setDay(String day)
    {
        this.day = day;
    }


    /**
     * @param capacity set labratory's capacity
     */
    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }


    /**
     * get the number of students
     */
    public int getCurrentSize()
    {
        return currentSize;
    }

    /**
     * @param currentSize set the size
     */
    public void setCurrentSize(int currentSize)
    {
        this.currentSize = currentSize;
    }
}
