package structural.Facade.DTO;

import structural.Facade.EmployeeFacade;
import structural.Facade.EmployeeManagementSystem;
import structural.Facade.Facade;
import structural.Facade.ManagementSystem;

public class EmployeeDTO {
    EmployeeFacade facade;
    ManagementSystem manager;
    String employee;

    String id;
    public Boolean create(String employeeName, String id){
        this.employee = employeeName;
        this.id = id;
        this.facade=new EmployeeFacade(this.employee, this.id);
        this.manager= new EmployeeManagementSystem(this.employee, this.id);
        return true;

    }

    void delete( String id){
        manager.delete(id);

    }

    public void getMeIn(){
        facade.getMeIn();
    }
}
