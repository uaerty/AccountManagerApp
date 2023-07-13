package com.accounts.main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String customerfname;
	private String customerlname;
	private String customerAddress;
	private int customerAccountNumber;
	private int customerSavings;

	protected Account() {
	}
	
	protected Account(String customerfname, String customerlname, String customerAddress, int customerAccountNumber,
			int customerSavings) {
		this.customerfname = customerfname;
		this.customerlname = customerlname;
		this.customerAddress = customerAddress;
		this.customerAccountNumber = customerAccountNumber;
		this.customerSavings = customerSavings;
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCustomerfname() {
		return customerfname;
	}

	public void setCustomerfname(String customerfname) {
		this.customerfname = customerfname;
	}

	public String getCustomerlname() {
		return customerlname;
	}

	public void setCustomerlname(String customerlname) {
		this.customerlname = customerlname;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getCustomerAccountNumber() {
		return customerAccountNumber;
	}

	public void setCustomerAccountNumber(int customerAccountNumber) {
		this.customerAccountNumber = customerAccountNumber;
	}

	public int getCustomerSavings() {
		return customerSavings;
	}

	public void setCustomerSavings(int customerSavings) {
		this.customerSavings = customerSavings;
	}

}
