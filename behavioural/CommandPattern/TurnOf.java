package behavioural.CommandPattern;

public class TurnOf implements Command{

    Device device;

    TurnOf(Device device){
        this.device=device;
    }

    @Override
    public void execute() {
        device.on();
    }

    @Override
    public void undo() {
        device.off();
    }

    @Override
    public void redo() {
        device.on();
    }
}
