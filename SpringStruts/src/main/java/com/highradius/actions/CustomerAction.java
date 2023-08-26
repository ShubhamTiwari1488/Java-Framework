package com.highradius.actions;

import com.highradius.manager.CustomerManager;
import com.highradius.managerImpl.CustomerManagerImpl;
import com.highradius.pojo.Customer;

/*
 * add method to Add Customer
 * read method to read customer Data using ID
 * update method to update customer Data using ID
 * delete method to delete using customer ID
 * readAll method to retrieve all customers Data
 * */
public class CustomerAction {

	public Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String add() {
		String s = "ALREADY_PRESENT";
		CustomerManager customerManager = new CustomerManagerImpl();
		int result = customerManager.add(customer);
		if (result > 0)
			s = "ADDED";
		return s;
	}

}
