package observerpattern;

import observerpattern.Observer;

import java.util.ArrayList;
import java.util.Collection;

public class Subject {
    private Collection<Observer> observerCollection = new ArrayList<>();

    public void addObserver(Observer observer){
        observerCollection.add(observer);
    }

    public void notifyObservers(int count){
        for(Observer observer : observerCollection){
            observer.updateCount(count);
        }
    }
}
