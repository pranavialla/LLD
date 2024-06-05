package behavioural.Strategy;


public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String CVV;
    private String expiry;

    public CreditCardStrategy(String cardNumber, String CVV, String expiry) {
        this.cardNumber = cardNumber;
        this.CVV = CVV;
        this.expiry = expiry;
    }

    @Override
    public void payAmount(int amount) {
        System.out.println("payed amount "+amount+" using Credit card");
    }
}
