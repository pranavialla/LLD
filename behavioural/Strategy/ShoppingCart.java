package behavioural.Strategy;


import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items ;

    public ShoppingCart(){
        this.items= new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int total= 0;
        for (Item item : this.items){
            total+=item.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentStrategy){
        int amount = calculateTotal();
        paymentStrategy.payAmount(amount);
    }
}
