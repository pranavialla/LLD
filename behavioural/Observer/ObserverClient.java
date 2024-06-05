package behavioural.Observer;

import behavioural.Behavioural;

import java.util.Observer;

public class ObserverClient implements Behavioural {

    public ObserverClient(){
        System.out.println("***********Observer Pattern***********");
        CricketDataPublisher publisher=new CricketDataPublisher();

        publisher.changeData(1,1,1);

        AverageScoreDisplay AvgObservable= new AverageScoreDisplay();
        CurrentScoreDisplay ScoreObservable= new CurrentScoreDisplay();
        CrickerDataObserver observer1=new CrickerDataObserver();

        publisher.registerObserver(observer1);

        publisher.changeData(2,1,4);




    }


}
