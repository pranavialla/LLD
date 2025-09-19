package creational.AbstractFactory.Factory;

import creational.AbstractFactory.PhoneStore;

public interface  Factory {
    public PhoneStore getModel(Model model);
}
