public class Cylinder extends Circle {
    private double height = 3;

    public Cylinder() {

    }

    public Cylinder(double height, String color, double radius) {
        super(color, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(double radius) {
        return super.getArea(radius);
    }

    public double getVolume(double radius, double height) {
        return radius * radius * height * Math.PI;
    }

    public String toString() {
        return "Day la hinh tru" + " co " +
                " ban kinh la: " + getRadius() +
                " chieu cao la: " + getHeight() +
                " mau sac la: " + getColor();

    }
}

