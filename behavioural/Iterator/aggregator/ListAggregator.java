package behavioural.Iterator.aggregator;

import behavioural.Iterator.iterator.Iterator;
import behavioural.Iterator.iterator.ListIterator;

public class ListAggregator implements Aggregator{


    @Override
    public Iterator iterator() {
        return new ListIterator(this);
    }
}
