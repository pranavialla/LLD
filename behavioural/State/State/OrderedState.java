package behavioural.State.State;

import behavioural.State.BoxPackage;

public class OrderedState implements PackageState{
    @Override
    public void next(BoxPackage pkg) {
        pkg.setState(new DeliveredState());
    }

    @Override
    public void prev(BoxPackage pkg) {
        System.out.println("it is in root state");
    }


    @Override
    public void printStatus() {
        System.out.println("Ordered");
    }
}
