package creational.AbstractFactory.Factory;

import creational.AbstractFactory.Apple;
import creational.AbstractFactory.PhoneStore;

import java.util.Objects;

public class PhoneFactory {
        public static Factory getPhone(String model)
        {
            if(Objects.equals(model, "APPLE"))
                return new AppleFactory();
            else if(Objects.equals(model, "SAMSUNG"))
                return new SamsungFactory();
            else if(Objects.equals(model, "ONEPLUS"))
                return new OneplusFactory();

            return null;
        }
}
