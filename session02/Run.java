public class Run
{
    public static void main(String[] args)
    {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Student std4 = new Student("Alireza", "Nejadi", "9931059");
        Student std5 = new Student("Armin", "Goodarzi", "9731058");
        Student std6 = new Student("Abolfazl", "Feijani", "9831059");

        //std1.print();
        std1.setGrade(15);
        //std1.print();

        //std2.print();
        std2.setGrade(11);
        //std2.print();

        //std3.print();
        std3.setFirstName("HamidReza");
        //std3.print();

        std4.setGrade(20);
        std5.setGrade(20);
        std6.setGrade(12);

        Lab myLab = new Lab(40, "Saturday");
        Lab lab2 = new Lab(30, "Monday");
        Lab lab3 = new Lab(20, "Sunday");

        myLab.enrollStudent(std1);
        myLab.enrollStudent(std2);

        lab2.enrollStudent(std3);
        lab2.enrollStudent(std4);

        lab3.enrollStudent(std5);
        lab3.enrollStudent(std6);

        College college1 = new College(10, "Computer");

        college1.addLab(myLab);
        college1.addLab(lab2);
        college1.addLab(lab3);

        //myLab.print();

        college1.print();



    }

}
