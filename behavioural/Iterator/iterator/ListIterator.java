package behavioural.Iterator.iterator;

import behavioural.Iterator.aggregator.Aggregator;

public class ListIterator implements Iterator{
    Aggregator list;
    public ListIterator(Aggregator list){
        this.list = list;
        System.out.println("diff list methods implemeted for this for client");
    }

    @Override
    public boolean hasNext() {
        return true;
    }
}
