package creational.AbstractFactory.Factory;

import creational.AbstractFactory.*;

import java.util.Objects;

public class OneplusFactory implements Factory
{
    public PhoneStore getModel(String model)
    {
        if(Objects.equals(model, "NORD"))
            return new Nord();
        else if(Objects.equals(model, "NORDPRO"))
            return new NordPro();
        else {
            return null;
        }
    }
}