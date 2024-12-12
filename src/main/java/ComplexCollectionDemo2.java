import java.util.ArrayList;
import java.util.List;

public class ComplexCollectionDemo2 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Kanishk",01,'M');
        Employee e2 = new Employee("Sayali",02,'F');
        Employee e3 = new Employee("Prateek",03,'M');
        Employee e4 = new Employee("Shreya",04,'F');

        List<Employee> emp = new ArrayList<Employee>();
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        emp.add(e4);
        System.out.println("Name | Id | Gender");
        for(Employee e : emp){
            //System.out.println(e.getName()+" | "+e.getId()+" | "+e.getGender());
            e.printEmployeeDetails();
        }
    }
}
