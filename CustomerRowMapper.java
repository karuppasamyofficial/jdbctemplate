package simplejdbctemplate;
import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import simplejdbctemplate.Customer;

public class CustomerRowMapper {

	public Object mapRow(ResultSet rs, int rowNum) 
			throws SQLException {
		// TODO Auto-generated method stub
		
		Customer customer = new Customer();
		customer.setCust_id(rs.getInt("CUST_ID"));
		customer.setCust_name(rs.getString("CUST_NAME"));
		customer.setAge(rs.getInt("AGE"));
		
		return customer;
	}

}
