package creational.Prototype;

public class Employee extends Prototype {
    String name;
    String id;
    String company;
    Employee(String name, String id, String company){
        this.name = name;
        this.id = id;
        this.company = company;
    }

    @Override
    public Employee clone() throws CloneNotSupportedException {
        return new Employee(this.name, this.id, this.company);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id + ", company=" + company + '}';
    }

}
