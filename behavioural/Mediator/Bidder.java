package behavioural.Mediator;

public class Bidder implements Colleague{
    String name;
    Mediator mediator;
    Bidder(String name, Mediator mediator){
        this.name = name;
        this.mediator =mediator;
    }
    int bidAmount;
    @Override
    public void notify(String bidderName, int colleagueBidAmount) {
        System.out.println("Bidder: " + bidderName +  " bidded for: " + colleagueBidAmount);
        System.out.println("my bid amount : " + this.bidAmount);
    }

    @Override
    public void placeABid(int bidAmount) {
        this.bidAmount=bidAmount;
        mediator.placeABid(this, bidAmount);
    }
}
