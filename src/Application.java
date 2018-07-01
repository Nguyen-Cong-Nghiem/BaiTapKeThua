import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao ban kinh: ");
//        double radiuss = sc.nextDouble();
        Circle circle = new Circle();
        System.out.println(circle);
//        System.out.println(circle.getArea(radiuss));
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);
    }
}
