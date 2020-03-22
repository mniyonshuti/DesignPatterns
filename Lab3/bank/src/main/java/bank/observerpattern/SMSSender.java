package bank.observerpattern;

import bank.domain.Account;

public class SMSSender extends Observer {

    @Override
    public void update(Account account) {
        System.out.println("SMS sent to  AccountNumber: " + account.getAccountnumber() + " and Account Name: " + account.getCustomer().getName());
    }
}
