package person;

public class Students extends Person{
    private String program;
    private int year;
    private double fee;

    public Students() {

    }

    public Students(String program, int year, double fee,String name,String address) {
        super(name,address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public int getYear() {
        return year;
    }

    public String getProgram() {
        return program;
    }

    public String toString() {
        return super.toString() + " program: " + getProgram()
                + "\n" + "year: " + getYear() + "fee: " + getFee();

    }
}
