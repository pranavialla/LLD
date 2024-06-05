package behavioural.State.State;

import behavioural.State.BoxPackage;

public interface PackageState {
    void next(BoxPackage pkg);
    void prev(BoxPackage pkg);

    void printStatus();
}
