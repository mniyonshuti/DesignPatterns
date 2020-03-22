package bank.service;

import bank.domain.Account;

import java.util.Collection;

public interface IAccountService {
    Account createSavingsAccount(long accountNumber, String customerName);

    Account createCheckingAccount(long accountNumber, String customerName);

    Account getAccount(long accountNumber);

    Collection<Account> getAllAccounts();

    void deposit(long accountNumber, double amount);

    void withdraw(long accountNumber, double amount);

    void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description);

    public  void addInterest();
}
