package behavioural.Strategy;

public class PaypalStrategy implements PaymentStrategy {
    private String email ;
    private String password;

    public PaypalStrategy(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void payAmount(int amount) {
        System.out.println("payed amount "+amount+" using Paypal");
    }
}
