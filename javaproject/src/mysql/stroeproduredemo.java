package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import com.mysql.cj.jdbc.CallableStatement;

public class stroeproduredemo {

	public static void main(String[] args) {
		 PreparedStatement myStmt = null;
		// TODO Auto-generated method stub
		try {
			  Class.forName("com.mysql.jdbc.Driver");
			  
			  }catch(ClassNotFoundException e) {
				  e.printStackTrace();}
		 try {
	            // prepare statement
	            myStmt = myConn.prepareStatement("insert into employees"
	                    + " (first_name, last_name, email, salary, date_of_birth)"
	                    + " values (?, ?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
	             
	            // set params
	            myStmt.setString(1, theEmployee.getFirstName());
	            myStmt.setString(2, theEmployee.getLastName());
	            myStmt.setString(3, theEmployee.getEmail());
	            myStmt.setBigDecimal(4, theEmployee.getSalary());
	             
	            java.sql.Date dateOfBirth = null;
	            if (theEmployee.getDateOfBirth() != null) {
	                dateOfBirth = new java.sql.Date(theEmployee.getDateOfBirth().getTime());
	            }
	 
	            myStmt.setDate(5, dateOfBirth);
	             
	            // execute SQL
	            myStmt.executeUpdate(); 
	             
		 
	}

	}

}
