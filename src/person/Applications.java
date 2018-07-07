package person;

public class Applications {
    public static void main(String[] args) {
       Person person =new Person("Nga","Hanoi");
        System.out.println(person.toString());
        Students students=new Students("nghiem",2018,800000,"nghiem","ha noi");
        System.out.println(students.toString());
        Staff staff = new Staff("Fat", "ho chi minh", "xuan dinh", 5000000);
        System.out.println(staff.toString());
    }

}
