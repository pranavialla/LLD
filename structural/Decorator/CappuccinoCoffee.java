package structural.Decorator;

import structural.Decorator.Coffee;

public class CappuccinoCoffee implements Coffee {


    public CappuccinoCoffee(){
        System.out.println("In Cappuccino");
    }

    @Override
    public String getDescription() {
        return "Cappuccino with";
    }

    @Override
    public double getCost() {
        return 4;
    }

}
