package bank.observerpattern;

import bank.domain.Account;

import java.util.ArrayList;
import java.util.Collection;

public class Subject {
    private Collection<Observer> observerCollection = new ArrayList<>();

    public void addObserver(Observer observer) {
        observerCollection.add(observer);
    }

    public void notifyObservers(Account account) {
        for (Observer observer : observerCollection) {
            observer.update(account);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
    }

    public void notifyObservers(Account fromAccount, Account toAccount) {
        for (Observer observer : observerCollection) {
            observer.update(fromAccount);
            observer.update(toAccount);
        }
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println();
    }
}
