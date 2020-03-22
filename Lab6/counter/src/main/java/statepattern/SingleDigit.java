package statepattern;

import observerpattern.Counter;

public class SingleDigit extends CounterState{

    public SingleDigit(Counter counter) {
        super(counter);
    }

    @Override
    public void incrementCounter() {
        int newCounter = counter.getCount() + 1;
        if(newCounter >= 10){
            DoubleDigit doubleDigit = new DoubleDigit(counter);
            counter.setCounterState(doubleDigit);
        }
        counter.setCount(newCounter);
    }

    @Override
    public void decrementCounter() {
        int newCounter = counter.getCount() - 1;
        counter.setCount(newCounter);
    }

    @Override
    public String getCounter() {
        return "Single";
    }
}
