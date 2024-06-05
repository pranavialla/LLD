package structural.Facade;

public class EmployeeManagementSystem implements  ManagementSystem{
    String name;
    String id;
    public EmployeeManagementSystem(String name, String id){
        System.out.println("Employeee created "+ name +  " with id "+ id   );
    }

    public void delete(String id){
        System.out.println("Employee deleted with id "+id);
    }
}
