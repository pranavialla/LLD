package behavioural.Mediator;

public class Platform {
    public Platform() {
        Mediator mediator = new Mediator();


        Bidder pranavi= mediator.addBidder("pranavi");
        Bidder nitin = mediator.addBidder("nitin");



        mediator.placeABid(pranavi, 23443);

    }
}
