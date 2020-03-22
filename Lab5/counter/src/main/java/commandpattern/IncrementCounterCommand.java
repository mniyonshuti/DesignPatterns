package commandpattern;

import observerpattern.Counter;

public class IncrementCounterCommand implements Command {
    private Counter counter;

    public IncrementCounterCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void execute() {
        counter.increment();
    }

    @Override
    public void unExecute() {
        counter.decrement();
    }
}
