package bank.observerpattern;

import bank.domain.Account;

public class EmailSender extends Observer {


    @Override
    public void update(Account account) {
        System.out.println("Email sent to  AccountNumber: " + account.getAccountnumber() + " and Account Name: " + account.getCustomer().getName());
    }
}
