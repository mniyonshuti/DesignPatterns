package bank.observerpattern;

import bank.domain.Account;

public class Logger extends Observer {

    @Override
    public void update(Account account) {
        System.out.println("Logging AccountNumber: " + account.getAccountnumber() + " and Account Name: " + account.getCustomer().getName());
    }
}
