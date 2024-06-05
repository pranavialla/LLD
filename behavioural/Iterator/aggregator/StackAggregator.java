package behavioural.Iterator.aggregator;

import behavioural.Iterator.iterator.Iterator;
import behavioural.Iterator.iterator.StackIterator;

public class StackAggregator implements Aggregator{
    @Override
    public Iterator iterator() {
        return new StackIterator(this);
    }
}
