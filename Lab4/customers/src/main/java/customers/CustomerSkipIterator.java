package customers;

import java.util.Iterator;
import java.util.List;

public class CustomerSkipIterator implements Iterator<Customer> {
    private final List<Customer> list;
    private int position;

    public CustomerSkipIterator(List<Customer> list) {
        this.list = list;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Customer next() {
        Customer current = list.get(position);
        position += 2;
        return current;
    }
}
