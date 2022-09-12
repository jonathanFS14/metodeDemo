package dk.kea;
public class Person {

    private double height;
    private int age;

    public int getAge() {
        return age;
    }
    public Person (int age ,double height){
    this.height = height;
    this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
    this.height = height;
    }

    public void hasBirthday(){
    age++;
    }
}