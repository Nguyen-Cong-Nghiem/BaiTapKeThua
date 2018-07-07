package person;

public class Staff extends Person {
    private String school;
    private double  pay;

    public Staff() {

    }

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.pay = pay;
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public String getSchool() {
        return school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String toString() {
        return super.toString() + " School: " + getSchool() + "Pay: " + getPay();
    }
}
