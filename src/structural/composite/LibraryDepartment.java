package structural.composite;

public class LibraryDepartment implements Department{
    @Override
    public void getDepartmentName() {
        System.out.println("Library department");
    }
}
