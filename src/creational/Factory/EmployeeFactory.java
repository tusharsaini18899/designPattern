package creational.Factory;

public class EmployeeFactory {
    public static Employee getEmployee(Boolean isAndroidDeveloper) {
        if (isAndroidDeveloper)
            return new AndroidDeveloper();
        else
            return new WebDeveloper();
    }
}