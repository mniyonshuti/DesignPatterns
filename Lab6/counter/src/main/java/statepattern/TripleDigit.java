package statepattern;

import observerpattern.Counter;

public class TripleDigit extends CounterState{
    public TripleDigit(Counter counter) {
        super(counter);
    }

    @Override
    public void incrementCounter() {
        int newCounter = counter.getCount() + 3;
        counter.setCount(newCounter);
    }

    @Override
    public void decrementCounter() {
        int newCounter = counter.getCount() - 3;
        if(newCounter < 100){
            DoubleDigit doubleDigit = new DoubleDigit(counter);
            counter.setCounterState(doubleDigit);
        }
        counter.setCount(newCounter);
    }

    @Override
    public String getCounter() {
        return "Triple";
    }
}
