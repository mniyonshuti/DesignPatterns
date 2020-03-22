package bank.commanpattern;

import bank.domain.Account;

public class DepositCommand implements Command {
    private double amount;
    private Account account;

    public DepositCommand(Account account, double amount) {
        this.amount = amount;
        this.account = account;
    }

    @Override
    public void execute() {
        account.deposit(amount);
    }

    @Override
    public void unExecute() {
        account.withdraw(amount);
    }
}
