package creational.Prototype;

public class Students extends Prototype{
    String name;
    String id;
    String school;

    Students(String name, String id, String school){
        this.name = name;
        this.id = id;
        this.school = school;
    }
    @Override
    public Students clone() throws CloneNotSupportedException {
        return new Students(this.name, this.id, this.school);
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", company=" + school + '}';
    }
}
