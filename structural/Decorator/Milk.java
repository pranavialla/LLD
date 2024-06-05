package structural.Decorator;

public class Milk extends CoffeeToppings {

    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
        System.out.println("Adding Milk");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

}
