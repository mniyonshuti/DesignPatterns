package bank.commanpattern;

import bank.domain.Account;

public class WithdrawCommand implements Command {
    private double amount;
    private Account account;

    public WithdrawCommand(Account account, double amount) {
        this.amount = amount;
        this.account = account;
    }

    @Override
    public void execute() {
        account.withdraw(amount);
    }

    @Override
    public void unExecute() {
        account.deposit(amount);
    }
}
