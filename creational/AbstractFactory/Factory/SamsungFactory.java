package creational.AbstractFactory.Factory;

import creational.AbstractFactory.*;

import java.util.Objects;

public class SamsungFactory implements Factory{
    public  PhoneStore getModel(String model)
    {
        if(Objects.equals(model, "BASIC"))
            return new Basic();
        else if(Objects.equals(model, "ULTRA"))
            return new Ultra();
        else {
            return null;
        }
    }
}
