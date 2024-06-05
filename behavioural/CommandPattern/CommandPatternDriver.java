package behavioural.CommandPattern;

public class CommandPatternDriver {
    public CommandPatternDriver(){
        Device fan=new Fan();
        Device bulb=new Bulb();
        Remote remote=new Remote();

        Command command=new TurnOn(fan);

        remote.sett(command);
        remote.execute();
    }

}
