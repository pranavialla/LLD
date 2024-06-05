package behavioural.Iterator;

import behavioural.Iterator.aggregator.StackAggregator;
import behavioural.Iterator.iterator.Iterator;

public class iteratorClient {
    public iteratorClient(){
        StackAggregator stack = new StackAggregator();
        Iterator iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println("looping over");
            break;
        }
    }
}
