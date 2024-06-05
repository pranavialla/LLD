package creational.AbstractFactory;

import creational.AbstractFactory.Factory.PhoneFactory;

public class Client {
    public Client(){
        PhoneFactory.getPhone("APPLE").getModel("PRO");
    }
}
