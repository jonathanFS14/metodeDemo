package dk.kea;
public class Main {
    public static void main(String[] args) {

    Person p1 = new Person(19,1.82);

    Person p2 = new Person(12,1.44);
        System.out.println(p1.getHeight());
    p1.setHeight(1.87);
        System.out.println(p1.getHeight());
    p1.hasBirthday();
        System.out.println(p1.getAge());

    }
}
