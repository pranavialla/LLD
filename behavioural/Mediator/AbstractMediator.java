package behavioural.Mediator;

import java.util.ArrayList;
import java.util.List;

public interface AbstractMediator {
    Mediator mediator = new Mediator();
    abstract Bidder addBidder(String bidderName);
    abstract public void notifyBidder(Bidder bidder, int bidAmount);
    abstract public void placeABid(Bidder bidder, int bidAmount);
}
