package bank.service;

import java.util.Collection;

import bank.commanpattern.DepositCommand;
import bank.commanpattern.HistoryList;
import bank.commanpattern.TransferFundsCommand;
import bank.commanpattern.WithdrawCommand;
import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	HistoryList historyList = new HistoryList();

	
	public AccountService(){
		accountDAO=new AccountDAO();
	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		DepositCommand depositCommand = new DepositCommand(account, amount);
		depositCommand.execute();
		historyList.addCommand(depositCommand);
		//account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		WithdrawCommand withdrawCommand = new WithdrawCommand(account, amount);
		withdrawCommand.execute();
		historyList.addCommand(withdrawCommand);
		//account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		//fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
		TransferFundsCommand transferFundsCommand = new TransferFundsCommand(fromAccount, toAccount, amount, description);
		historyList.addCommand(transferFundsCommand);
		transferFundsCommand.execute();
	}

	@Override
	public HistoryList getHistoryList() {
		return historyList;
	}
}
