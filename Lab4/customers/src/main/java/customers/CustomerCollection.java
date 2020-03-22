package customers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CustomerCollection {
	List<Customer> customers = new ArrayList<Customer>();
	
	public void add(Customer customer) {
		customers.add(customer);
	}
	
	public void print() {
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	public Iterator ageIterator(){
		return new AgeIterator(customers);
	}

	public Iterator filterCustomerIterator(Predicate<Customer> predicate){
		return new CustomerFilterIterator(customers, predicate);
	}

	public Iterator skipCustomerIterator(){
		return new CustomerSkipIterator(customers);
	}
}
