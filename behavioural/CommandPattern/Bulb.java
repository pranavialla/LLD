package behavioural.CommandPattern;

public class Bulb implements Device{

    Boolean isOn;
    @Override
    public void on() {
        isOn = true;
        System.out.println("Bulb on");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("Bulb off");
    }
}
