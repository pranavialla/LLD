package structural.Facade;

public class GatePassManagementSystem implements ManagementSystem{

    String id;

    GatePassManagementSystem(String id){
        this.id = id;
    }
    @Override
    public void delete(String id) {
        System.out.println("removing pass for " + id);
    }

    public void getEntry(String id) {
        System.out.println("entry for " + id);

    }

}
