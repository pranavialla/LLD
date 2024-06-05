package behavioural.Observer.Displays;


import behavioural.Observer.CrickerDataObserver;
import behavioural.Observer.CricketDataPublisher;
import behavioural.Observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class AverageScoreDisplay implements CricketDataObservable {
    float runRate;
    float predictedScore;
    int runs;
    float overs;

    List<Subject> observables = new ArrayList<>();;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate =(float) runs/ overs;
        this.predictedScore =runRate*50;

        display();
    }

    public void addObservable(Subject observable) {
        observables.add(observable);
    }

    public void updateByPull(Subject obeservable, CrickerDataObserver observer){
        CricketDataPublisher cricketDataPublisher=(CricketDataPublisher)  obeservable;
        if (obeservable instanceof CricketDataPublisher){
            observer.runs=cricketDataPublisher.getRuns();
            observer.overs=cricketDataPublisher.getOver();

            observer.display();

        }
    }

    public void display(){
        System.out.println("\n predictedScore : " + this.predictedScore + "\n runRate : " + this.runRate);
    }


}
