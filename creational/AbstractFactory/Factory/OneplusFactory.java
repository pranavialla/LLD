package creational.AbstractFactory.Factory;

import creational.AbstractFactory.*;

import java.util.Objects;

public class OneplusFactory implements Factory
{
   @Override
    public PhoneStore getModel(Model model) {
        switch (model) {
            case NORD:
                return new Nord();
            case NORDPRO:
                return new NordPro();
            default:
                throw new IllegalArgumentException("Model not supported for Oneplus: " + model);
        }
    }
}