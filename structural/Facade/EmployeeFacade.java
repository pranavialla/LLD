package structural.Facade;

public class EmployeeFacade implements Facade{
    ManagementSystem employeeManager;
    GatePassManagementSystem gatePassManagementSystem;
    String name;
    String id;

    public EmployeeFacade(String name, String employeeId){
        this.name = name;
        this.id = employeeId;
        employeeManager = new EmployeeManagementSystem(name, employeeId);
        gatePassManagementSystem= new GatePassManagementSystem(employeeId);
    }

    public void getMeIn(){
        gatePassManagementSystem.getEntry(this.id);
    }

}
