package com.codegnan.hibernateapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class Account {
	@Id
	@Column(name = "ACCNO", length = 10)
	private String accNo;
	@Column(name = "ACCNAME", length = 10)
	private String accName;
	@Column(name = "ACCTYPE", length = 10)
	private String accType;
	@Column(name = "BALANCE", length = 10)
	private int balance;

	// constructors
	// setters and getters
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String accNo, String accName, String accType, int balance) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.accType = accType;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accType=" + accType + ", balance=" + balance
				+ "]";
	}

}

