package behavioural.Strategy;


import behavioural.Behavioural;
import behavioural.Strategy.Startegy2.*;


public class Strategy implements Behavioural {
    public Strategy() {
        System.out.println("***********Strategy Pattern***********");

        ShoppingCart cart = new ShoppingCart();
        Item item1= new Item("1", 10);
        Item item2= new Item("2", 20);
        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("email.com", "password"));

        cart.pay(new CreditCardStrategy("number", "CVV", "expiry"));


        System.out.println("***********Strategy Pattern 2  ***********");

        Vehicle Goods=new Goods(new Drive());
        Goods.drive();

        Vehicle davidSon=new DavidSon(new SpecialDrive());
        davidSon.drive();



    }
}
