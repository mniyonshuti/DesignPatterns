package bank.observerpattern;

import bank.domain.Account;

public abstract class Observer {
    public abstract void update(Account account);
}
