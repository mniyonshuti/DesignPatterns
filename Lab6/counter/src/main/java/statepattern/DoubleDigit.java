package statepattern;

import observerpattern.Counter;

public class DoubleDigit extends CounterState {
    private int count;

    public DoubleDigit(Counter counter) {
        super(counter);
    }

    @Override
    public void incrementCounter() {
        int newCounter = counter.getCount() + 2;
        if(newCounter >= 100){
            TripleDigit tripleDigit = new TripleDigit(counter);
            counter.setCounterState(tripleDigit);
        }
        counter.setCount(newCounter);
    }

    @Override
    public void decrementCounter() {
        int newCounter = counter.getCount() - 2;
        if(newCounter < 10){
            SingleDigit singleDigit = new SingleDigit(counter);
            counter.setCounterState(singleDigit);
        }
        counter.setCount(newCounter);
    }

    @Override
    public String getCounter() {
        return "Double";
    }
}
