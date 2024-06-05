package behavioural.State.State;

import behavioural.State.BoxPackage;

public class ReceivedState implements PackageState{
    @Override
    public void next(BoxPackage pkg) {
        System.out.println("package is recieved by client");
    }

    @Override
    public void prev(BoxPackage pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void printStatus() {
        System.out.println("ReceivedState");
    }
}
