public class Patient
{
    private String name;
    private String birthDate;
    private String gender;
    private String insuranceType;
    private String certificate;
    private String job;
    private String city;
    private String address;
    private Doctor doctor;
    private Doctor secondDoctor;


    public Patient(String name, String birthDate, String gender, String insuranceType, String certificate, String job, String city, String address)
    {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.insuranceType = insuranceType;
        this.certificate = certificate;
        this.job = job;
        this.city = city;
        this.address = address;

    }


    public void payMoney()
    {

    }


    public void setDoctor(Doctor doctor)
    {
        this.doctor = doctor;

    }

    public void setSecondDoctor(Doctor secondDoctor)
    {
        this.secondDoctor = secondDoctor;

    }


    public void getAccess()
    {

    }



}
