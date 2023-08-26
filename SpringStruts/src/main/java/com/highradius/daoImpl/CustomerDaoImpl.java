package com.highradius.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.highradius.connection.DBConnection;
import com.highradius.dao.CustomerDao;
import com.highradius.pojo.Customer;

public class CustomerDaoImpl implements CustomerDao {

	Connection con = null;
	PreparedStatement ps = null;

	@Override
	public int add(Customer customer) {
		int result = 0;

		con = DBConnection.getConnection();
		String sql = "INSERT INTO CUSTOMER (first_name,customer_id) " + "VALUES(?,?)";
		try {
			ps = con.prepareStatement(sql);

			// setting the values
			ps.setString(1, customer.getFirstName());
			ps.setInt(2, customer.getCustomerId());
			// Executing the statement for Update
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

	@Override
	public boolean findCustomerById(int customerId) {
		int result = 0;

		con = DBConnection.getConnection();
		String sql = "SELECT * FROM CUSTOMER WHERE customer_id = ?";
		try {
			ps = con.prepareStatement(sql);

			// setting the values
			ps.setInt(1, customerId);
			// Executing the statement for Update
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
