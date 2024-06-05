package creational.Prototype;

public class Driver {
    public Driver() throws CloneNotSupportedException {
        Employee employee=new Employee("pranavi", "3014", "tekion");
        Employee employee2= employee.clone();

        System.out.println(employee.toString());
        System.out.println(employee2.toString());


        Students student=new Students("pranavi", "3014", "samyuktha");
        Students student1= student.clone();

        System.out.println(student.toString());
        System.out.println(student1.toString());


    }
}
