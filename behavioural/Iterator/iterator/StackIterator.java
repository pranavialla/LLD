package behavioural.Iterator.iterator;

import behavioural.Iterator.aggregator.Aggregator;

public class StackIterator implements Iterator {
    Aggregator stack;
    public StackIterator(Aggregator stack){
        this.stack = stack;
        System.out.println("diff stack methods implemeted for this for client");
    }

    @Override
    public boolean hasNext() {
        return true;
    }
}
