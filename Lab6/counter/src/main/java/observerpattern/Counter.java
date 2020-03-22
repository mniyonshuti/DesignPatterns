package observerpattern;

import statepattern.CounterState;

public class Counter extends Subject {
	CounterState counterState;
	private int count=0;

	public void increment(){
		counterState.incrementCounter();
		notifyObservers(count);
	}
	
	public void decrement(){
		counterState.decrementCounter();
		notifyObservers(count);
	}

	public CounterState getCounterState() {
		return counterState;
	}

	public void setCounterState(CounterState counterState) {
		this.counterState = counterState;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
}
