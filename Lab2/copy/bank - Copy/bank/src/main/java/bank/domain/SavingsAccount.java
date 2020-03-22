package bank.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class SavingsAccount extends Account {

    long accountnumber;
    Collection<AccountEntry> entryList = new ArrayList<>();
    Customer customer;

    public SavingsAccount(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    @Override
    public double getBalance() {
        double balance = 0;
        for (AccountEntry entry : entryList) {
            balance += entry.getAmount();
        }
        return balance;
    }

    @Override
    public void deposit(double amount) {
        AccountEntry entry = new AccountEntry(new Date(), amount, "deposit", "", "");
        entryList.add(entry);
    }

    @Override
    public void withdraw(double amount) {
        AccountEntry entry = new AccountEntry(new Date(), -amount, "withdraw", "", "");
        entryList.add(entry);
    }

    @Override
    public void transferFunds(Account toAccount, double amount, String description) {
        AccountEntry fromEntry = new AccountEntry(new Date(), -amount, description, "" + toAccount.getAccountnumber(), toAccount.getCustomer().getName());
        AccountEntry toEntry = new AccountEntry(new Date(), amount, description, "" + toAccount.getAccountnumber(), toAccount.getCustomer().getName());
        entryList.add(fromEntry);
        toAccount.addEntry(toEntry);
    }

    @Override
    protected void addEntry(AccountEntry entry) {
        entryList.add(entry);
    }

    @Override
    public long getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(long accountnumber) {
        this.accountnumber = accountnumber;
    }

    @Override
    public double addInterest() {
        double currentBalance = getBalance();
        if (currentBalance < 1000) return (0.001 * currentBalance) + currentBalance;
        else if (currentBalance >= 1000 && currentBalance < 5000) return (0.002 * currentBalance) + currentBalance;
        else return (0.004 * currentBalance) + currentBalance;
    }

    @Override
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Collection<AccountEntry> getEntryList() {
        return entryList;
    }

    public void setEntryList(Collection<AccountEntry> entryList) {
        this.entryList = entryList;
    }

}
