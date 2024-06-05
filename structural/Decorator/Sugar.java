package structural.Decorator;

public class Sugar extends CoffeeToppings {
    public Sugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
        System.out.println("Adding suggar");
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ "sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }

}
