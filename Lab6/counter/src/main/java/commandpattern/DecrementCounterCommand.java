package commandpattern;

import observerpattern.Counter;

public class DecrementCounterCommand implements Command {
    private Counter counter;

    public DecrementCounterCommand(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void execute() {
        counter.decrement();
    }

    @Override
    public void unExecute() {
        counter.increment();
    }
}
