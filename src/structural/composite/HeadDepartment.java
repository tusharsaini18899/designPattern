package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department{

    List<Department> childDepartment;

    public HeadDepartment(){
        this.childDepartment=new ArrayList<>();
    }

    public void addDepartment(Department department){
        childDepartment.add(department);
    }

    @Override
    public void getDepartmentName() {
      childDepartment.forEach(Department::getDepartmentName);
    }


}
