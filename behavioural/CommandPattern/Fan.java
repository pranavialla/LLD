package behavioural.CommandPattern;

public class Fan implements Device{

    Boolean isOn;
    @Override
    public void on() {
        isOn = true;
        System.out.println("Fan on");
    }

    @Override
    public void off() {
        isOn = false;
        System.out.println("Fan off");
    }
}
