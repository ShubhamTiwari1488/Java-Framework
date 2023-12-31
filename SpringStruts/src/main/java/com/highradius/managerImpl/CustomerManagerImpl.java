package com.highradius.managerImpl;

import com.highradius.dao.CustomerDao;
import com.highradius.daoImpl.CustomerDaoImpl;
import com.highradius.manager.CustomerManager;
import com.highradius.pojo.Customer;

public class CustomerManagerImpl implements CustomerManager {

	CustomerDao customerDao = new CustomerDaoImpl();

	@Override
	public int add(Customer customer) {
		if (!customerDao.findCustomerById(customer.getCustomerId())) {
			return customerDao.add(customer);
		} else {
			return 0;
		}
	}

}
