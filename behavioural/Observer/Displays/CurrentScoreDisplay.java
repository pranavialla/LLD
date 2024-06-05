package behavioural.Observer.Displays;

import behavioural.Observer.CrickerDataObserver;
import behavioural.Observer.CricketDataPublisher;
import behavioural.Observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class CurrentScoreDisplay implements CricketDataObservable {
    int runs;
    int wickets;
    float overs;

    List<Subject> observables = new ArrayList<>();

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;

        display();
    }

    public void addObservable(Subject observable) {
        observables.add(observable);
    }

    public void updateByPull(Subject obeservable, CrickerDataObserver obserever){
        CricketDataPublisher cricketDataPublisher=(CricketDataPublisher)  obeservable;
        if (obeservable instanceof CricketDataPublisher){
            obserever.runs=cricketDataPublisher.getRuns();
            obserever.overs=cricketDataPublisher.getOver();
            obserever.wickets=cricketDataPublisher.getWickets();

            obserever.display();

        }
    }

    public void display() {
        System.out.println("\n runs : "+ runs + "\n wickets : "+ wickets + "\n overs : "+ overs);
    }

}
