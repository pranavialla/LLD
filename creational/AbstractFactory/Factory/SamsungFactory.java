package creational.AbstractFactory.Factory;

import creational.AbstractFactory.*;

import java.util.Objects;

public class SamsungFactory implements Factory{
   @Override
    public PhoneStore getModel(Model model) {
        switch (model) {
            case ULTRA:
                return new Ultra();
            case BASIC:
                return new Basic();
            default:
                throw new IllegalArgumentException("Model not supported for Samsung: " + model);
        }
    }
}
