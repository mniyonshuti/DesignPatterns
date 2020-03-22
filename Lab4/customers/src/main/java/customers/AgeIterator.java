package customers;


import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AgeIterator implements Iterator<Customer> {
    private final List<Customer> list;
    private int position;

    public AgeIterator(List<Customer> list) {
        this.list = list;
        this.position = 0;
        Collections.sort(list, (a, b) -> {
            return a.getAge() - b.getAge();
        });
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Customer next() {
        return list.get(position++);
    }
}
