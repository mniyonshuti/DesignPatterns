package bank.domain;

import java.util.Collection;

public abstract class Account {
    public abstract double getBalance();

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public abstract void transferFunds(Account toAccount, double amount, String description);

    protected abstract void addEntry(AccountEntry entry);

    public abstract long getAccountnumber();

    public abstract Customer getCustomer();

    public abstract void setCustomer(Customer customer);

    public abstract Collection<AccountEntry> getEntryList();

    public abstract double addInterest();
}
