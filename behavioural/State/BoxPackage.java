package behavioural.State;

import behavioural.State.State.OrderedState;
import behavioural.State.State.PackageState;

public class BoxPackage {
    //present in cloned code
    private PackageState state=new OrderedState();

    public void setState(PackageState state) {
        this.state = state;
    }

    PackageState getState() {
        return this.state;
    }

    public void next(){
        state.next(this);
    }

    public void prev(){
        state.prev(this);
    }

    public void printStatus(){
        state.printStatus();
    }
}
