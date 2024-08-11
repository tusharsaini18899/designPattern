package creational;

import creational.abstractFactory.AndroidDeveloperFactory;
import creational.abstractFactory.Employee;
import creational.abstractFactory.EmployeeFactory;
import creational.abstractFactory.WebDeveloperFactory;
import creational.builder.User;
import creational.prototype.NetworkConnection;

public class CreationalDesign {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        // factory design selecting object at runtime
        System.out.println("********************  Factory Start  *************************");
        creational.Factory.Employee employee= creational.Factory.EmployeeFactory.getEmployee(true);
        System.out.println(employee.getSalary()+"");
        creational.Factory.Employee webDeveloper=creational.Factory.EmployeeFactory.getEmployee(false);
        System.out.println(webDeveloper.getSalary()+"");
        System.out.print("\n\n");



        // abstract factory -> factory of factories add abstract layer in factory
        // produce families of related objects without specifying their concrete classes.
        System.out.println("******************** Abstract Factory Start  *************************");
        Employee employee1= EmployeeFactory.getInstance(new AndroidDeveloperFactory());
        employee1.getSalary();
        Employee employee2= EmployeeFactory.getInstance(new WebDeveloperFactory());
        employee2.getSalary();
        System.out.print("\n\n");



        // Builder -> builder pattern create obj step by step and return final object with desired values of attributes
        // by factory class all responsibility for creating object, if object is heavy all complexity is the part of factory class so builder is good
        // by constructor we have to pass many argument in constructor to create object and some parameter might be optional
        System.out.println("********************  Builder Start  *************************");
        User user=new User.UserBuilder()
                .setEmailId("tushar@gmail.com")
                .setUserId("12")
                .build();
        System.out.println(user);
        User build=User.UserBuilder.builder()
                .setEmailId("tushar@gmail.com")
                .setUserId("12")
                .build();
        System.out.println(build);
        System.out.print("\n\n");



         // Prototype -> copy existing object rather than creating a new instance from scratch, because creating new object may costly
         // this approach saves costly resources and time ,especially when object creation is heavy process.so one object change the value and other object will be affected
        // Shallow copy->if any object inside object that object reference will be copy not the value
        // Deep copy->if any object inside object that object value will also be copy
        System.out.println("********************  Prototype Start  *************************");
        NetworkConnection networkConnection=new NetworkConnection();
        networkConnection.setIp("127.0.0.1");
        networkConnection.loadData();
        System.out.println(networkConnection);
        NetworkConnection networkConnection2=(NetworkConnection) networkConnection.clone();
        System.out.println(networkConnection2);

    }
}
