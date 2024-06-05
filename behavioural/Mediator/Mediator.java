package behavioural.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Mediator implements AbstractMediator {
    List<Bidder> bidders ;
    int bidAmount;
    Bidder bidder;

    public Mediator(){
        this.bidders = new  ArrayList<Bidder>();
    }
    @Override
    public Bidder addBidder(String name) {
        Bidder newBidder= new Bidder(name, mediator);
        bidders.add(newBidder);
        return newBidder;

    }

    @Override
    public void notifyBidder(Bidder biddedBidder, int bidAmount) {
        for(Bidder currentBidder : bidders){
            if(!currentBidder.equals(biddedBidder)){
                currentBidder.notify(biddedBidder.name, bidAmount);
            }
        }
    }

    @Override
    public void placeABid(Bidder bidder, int bidAmount) {
        if (bidAmount>this.bidAmount){
            this.bidAmount = bidAmount;
            this.bidder = bidder;
            bidder.placeABid(bidAmount);
            notifyBidder(bidder, bidAmount);
        }

    }
}
