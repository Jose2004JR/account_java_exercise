package model.entitites;
import model.excption.AccountException;

public class Account {
	protected Integer number;
	protected String holder;
	protected Double balance;
	protected Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public void deposit(double value) {
		this.balance += value;
	}
	public void withdraw(double value) throws AccountException{
		if(withdrawLimit < value) {
			throw new AccountException("the amount exceeds withdraw limit");
		}
		if(balance < value) {
			throw new AccountException("Not enough balance");
		}
		
		balance -= value;
		
	}
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
}
