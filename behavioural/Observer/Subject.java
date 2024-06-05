package behavioural.Observer;

public interface Subject {
    public void registerObserver(CrickerDataObserver cricketDataObserver);
    public void unregisterObserver(CrickerDataObserver cricketDataObserver);
    public void notifyObservers();
}
