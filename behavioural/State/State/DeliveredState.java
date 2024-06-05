package behavioural.State.State;

import behavioural.State.BoxPackage;

public class DeliveredState implements PackageState{

    public void next(BoxPackage pkg) {
        pkg.setState(new ReceivedState());
    }


    public void prev(BoxPackage pkg) {
        pkg.setState(new OrderedState());
    }


    public void printStatus() {
        System.out.println("DeliveredState");
    }
}
