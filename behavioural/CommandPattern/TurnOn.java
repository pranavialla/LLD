package behavioural.CommandPattern;


public class TurnOn implements Command{

    Device device;

    TurnOn(Device device){
        this.device=device;
    }
    @Override
    public void execute() {
        device.off();
    }

    @Override
    public void undo() {
         device.on();
    }

    @Override
    public void redo() {
        device.off();
    }
}
