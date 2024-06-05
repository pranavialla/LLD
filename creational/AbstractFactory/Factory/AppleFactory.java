package creational.AbstractFactory.Factory;

import creational.AbstractFactory.PhoneStore;
import creational.AbstractFactory.Pro;
import creational.AbstractFactory.ProMax;

import java.util.Objects;

public class AppleFactory implements Factory
{
    public PhoneStore getModel(String model)
    {
        if(Objects.equals(model, "PRO"))
            return new Pro();
        else if(Objects.equals(model, "PROMAX"))
            return new ProMax();
        else {
            return null;
        }
    }
}