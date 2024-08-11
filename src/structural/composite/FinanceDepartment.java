package structural.composite;

public class FinanceDepartment implements Department {
    @Override
    public void getDepartmentName() {
        System.out.println("Finance Department");
    }
}
