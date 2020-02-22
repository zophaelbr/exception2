package model.entities;

import model.exceptions.AcountException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String hoder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.holder = hoder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
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

	public void setHolder(String hoder) {
		this.holder = hoder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(Double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	
	public void deposit(Double amount) {
		balance += amount;
	}
	
	
	public void withDraw(Double amount) throws AcountException {
		if (balance < amount || withDrawLimit < amount) {
			throw new AcountException("Withdraw error: The amount exceeds withdraw limit!");
		}
		
		balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New balance: " + balance;
	}
}
