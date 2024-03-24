package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {

	@Id
	@Column(name="account_id")
	private int accountId;
	
	private String account;
	
	@ManyToOne
	private Bank bank;

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(int accountId, String account, Bank bank) {
		super();
		this.accountId = accountId;
		this.account = account;
		this.bank = bank;
	}

	
	
	
}
