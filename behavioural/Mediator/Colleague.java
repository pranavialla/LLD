package behavioural.Mediator;

public interface Colleague {
    void notify(String bidderName, int bidAmount);
    void placeABid(int bidAmount);

}
