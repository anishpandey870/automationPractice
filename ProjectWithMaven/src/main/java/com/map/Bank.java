package com.map;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Bank {
	@Id
	@Column(name="bank_id")
	private int bankId;
	
	private String bank;
	
	@OneToMany(mappedBy="bank")
	private List<Account> account;
	
	
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	
	
	
	public List<Account> getAccount() {
		return account;
	}
	public void setAccount(List<Account> account) {
		this.account = account;
	}
	
	
	public Bank(int bankId, String bank, List<Account> account) {
		super();
		this.bankId = bankId;
		this.bank = bank;
		this.account = account;
	}
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
