package model.entities;

public class Account {

	private Integer number;
	private String hoder;
	private Double balance;
	private Double withDrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String hoder, Double balance, Double withDrawLimit) {
		this.number = number;
		this.hoder = hoder;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHoder() {
		return hoder;
	}

	public void setHoder(String hoder) {
		this.hoder = hoder;
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
	
	public void withDraw(Double amount) {
		if (balance >= amount) {
			balance -= amount;
		}		
	}
	
}
