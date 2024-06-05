package behavioural.Observer;

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

    public void updateByPull(Subject obeservable, Object args){
        CricketDataPublisher cricketDataPublisher=(CricketDataPublisher)  obeservable;
        if (obeservable instanceof CricketDataPublisher){
            this.runs=cricketDataPublisher.getRuns();
            this.overs=cricketDataPublisher.getOver();
            this.wickets=cricketDataPublisher.getWickets();

            display();

        }
    }

    public void display() {
        System.out.println("\n runs : "+ runs + "\n wickets : "+ wickets + "\n overs : "+ overs);
    }

}
