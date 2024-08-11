package creational.abstractFactory;

public class EmployeeFactory {
    public static Employee getInstance(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.createEmployee();
    }
}