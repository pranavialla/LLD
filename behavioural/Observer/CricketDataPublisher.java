package behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class CricketDataPublisher implements Subject{

    List<CrickerDataObserver> cricketDataObserverList;

    private int runs;
    private int wickets;
    private float overs;

    public CricketDataPublisher() {
        cricketDataObserverList = new ArrayList<>();
    }

    @Override
    public void notifyObservers() {
        for (CrickerDataObserver observer : this.cricketDataObserverList){
            observer.update(this.runs, this.wickets, this.overs);
        }
    }

    @Override
    public void registerObserver(CrickerDataObserver observer) {
        cricketDataObserverList.add(observer);

    }

    @Override
    public void unregisterObserver( CrickerDataObserver observer) {
        cricketDataObserverList.remove(observer);
    }


    public  int getRuns(){
        return this.runs;
    }

    public float getOver(){
        return this.overs;
    }

    public int getWickets(){
        return this.wickets;
    }

    public void changeData(int runs, int wickets, float overs){
        this.wickets= wickets;
        this.runs= runs;
        this.overs= overs;

        notifyObservers();
    }

}
