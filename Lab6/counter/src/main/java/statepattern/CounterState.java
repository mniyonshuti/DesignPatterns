package statepattern;

import observerpattern.Counter;

public abstract class CounterState {
    Counter counter;

    public CounterState(Counter counter) {
        this.counter = counter;
    }

    public abstract void incrementCounter();
    public abstract void decrementCounter();
    public abstract String getCounter();
}
