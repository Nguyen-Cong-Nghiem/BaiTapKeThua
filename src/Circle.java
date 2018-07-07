public class Circle {
    private String color = "blue";
    private double radius;

    public Circle() {

    }

    public Circle(String color, double radius) {
        this.color = color;
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(double radius) {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Day la hinh tron"
                + " co ban kinh la: "
                + radius +" co mau la: " + color;

    }
}
