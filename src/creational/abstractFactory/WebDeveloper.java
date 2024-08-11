package creational.abstractFactory;

public class WebDeveloper implements Employee {
    public int getSalary() {
        System.out.println("I am web developer");
        return 20;
    }
}