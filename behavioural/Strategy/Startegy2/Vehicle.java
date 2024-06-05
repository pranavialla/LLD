package behavioural.Strategy.Startegy2;

public class Vehicle {
    DriveType driveType;
    Vehicle(DriveType driveType){
        this.driveType = driveType;
    }

    public void display(){
        System.out.println("Vehicle");
    }

    public void drive() {
        driveType.drive();
    }
}
