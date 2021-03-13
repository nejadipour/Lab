/**
 * The Student class represents a student in a student
administration system.
 * It holds the student details relevant in our context.
 *
 * @author Alireza
 * @version 0.0
 */


public class Student
{
    // the student's first name
    private String firstName;

    // the student's last name
    private String lastName;

    // the student's ID
    private String id;

    // the student's grade
    private int grade;


    /**
     * Create a new student with a given name and ID number.
     *
     * @param firstName first name of student
     * @param lastName last name of student
     * @param id ID of student
     */
    public Student(String firstName, String lastName, String id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        grade = 0;
    }

    /**
     * get the first name of student
     * @return firstName field
     */
    public String getFirstName()
    {
        return firstName;
    }


    /**
     * get the last name of student
     * @return lastName field
     */
    public String getLastName()
    {
        return lastName;
    }


    /**
     * get the ID of student
     * @return id field
     */
    public String getId()
    {
        return id;
    }


    /**
     * get the grade of student
     * @return grade field
     */
    public int getGrade()
    {
        return grade;
    }


    /**
     * @param fName set student's first name
     */
    public void setFirstName(String fName)
    {
        firstName = fName;
    }


    /**
     * @param lName set student's last name
     */
    public void setLastName(String lName)
    {
        firstName = lName;
    }


    /**
     * @param sId set student's ID
     */
    public void setId(String sId)
    {
        id = sId;
    }


    /**
     * @param sGrade set student's grade
     */
    public void setGrade(int sGrade)
    {
        grade = sGrade;
    }


    /**
     * Print the student's last name and ID number to the output terminal
     */
    public void print()
    {
        System.out.println(lastName + ", Student ID: "
                           + id + ", Grade: " + grade);

    }


}
