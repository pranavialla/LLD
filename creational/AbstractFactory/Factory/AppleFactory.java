package creational.AbstractFactory.Factory;

import creational.AbstractFactory.PhoneStore;
import creational.AbstractFactory.Pro;
import creational.AbstractFactory.ProMax;

import java.util.Objects;

public class AppleFactory implements Factory
{
    @Override
    public PhoneStore getModel(Model model) {
        switch (model) {
            case PRO:
                return new Pro();
            case PROMAX:
                return new ProMax();
            default:
                throw new IllegalArgumentException("Model not supported for Apple: " + model);
        }
    }
}