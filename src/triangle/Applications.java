package triangle;

import java.util.Scanner;

public class Applications {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao mau sac: ");
        String color = sc.nextLine();
        shape.setColor(color);
        System.out.println("nhap vao true false: ");
        boolean filled = sc.nextBoolean();
        shape.setFilled(filled);
        System.out.println("shap la: " + shape.toString());

        Triangle triangle = new Triangle();
        System.out.print("Nhap vao a,b,c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        triangle.setSide1(a);
        triangle.setSide2(b);
        triangle.setSide3(c);
        System.out.println(triangle.toString());
    }
}
