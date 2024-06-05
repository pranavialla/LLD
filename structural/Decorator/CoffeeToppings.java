package structural.Decorator;

public abstract class CoffeeToppings implements Coffee {
    protected Coffee decoratedCoffee;
    public CoffeeToppings(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost(){
        return decoratedCoffee.getCost();
    }
}
