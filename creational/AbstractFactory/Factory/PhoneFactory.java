package creational.AbstractFactory.Factory;

import creational.AbstractFactory.Apple;
import creational.AbstractFactory.PhoneStore;

import java.util.Objects;

public class PhoneFactory {
        public static Factory getFactory(Brand brand) {
        switch (brand) {
            case APPLE:
                return new AppleFactory();
            case SAMSUNG:
                return new SamsungFactory();
            case ONEPLUS:
                return new OneplusFactory();
            default:
                throw new IllegalArgumentException("Unknown brand: " + brand);
        }
    }
}
