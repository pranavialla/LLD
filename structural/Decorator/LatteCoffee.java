package structural.Decorator;

public class LatteCoffee implements Coffee {

    public  LatteCoffee(){
        System.out.println("In Latte");
    }
    @Override
    public String getDescription(){
        return "Latte with ";
    }

    @Override
    public double getCost(){
        return 4;
    }
}
