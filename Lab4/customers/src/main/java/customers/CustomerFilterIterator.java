package customers;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CustomerFilterIterator implements Iterator<Customer> {
    private final List<Customer> list;
    private int position;
    private Predicate<Customer> predicate;

    public CustomerFilterIterator(List<Customer> list, Predicate<Customer> predicate) {
        this.list = list;
        this.position = 0;
        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        int tempPos = position;
        while (tempPos < list.size()) {
            Customer nextCustomer = list.get(tempPos);
            if (predicate.test(nextCustomer)) return true;
            else tempPos++;
        }
        return false;
    }

    @Override
    public Customer next() {
        int tempPos = position;
        while (tempPos < list.size()) {
            Customer nextCustomer = list.get(tempPos);
            if (predicate.test(nextCustomer)) {
                position = tempPos + 1;
                return nextCustomer;
            } else tempPos++;
        }
        return null;
    }
}
