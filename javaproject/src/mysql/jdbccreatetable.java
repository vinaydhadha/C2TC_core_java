package mysql;
import java.sql.Connection;
import java.sql.Drivermanger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class jdbccreatetable {
  public static void main(String[] args) {
  
  try {
  Class.forName("com.mysql.jdbc.Driver");
  
  }catch(ClassNotFoundExeption e) {
	  e.printstackTrace();
  }
  try {
	  Connection con=DriverManger.getConnection("jbdccreatetable:mysql://localhost::3306/bd_employee","root","rootpasword");
	  Statement st=con.createStatement();
	  boolean rs=st.execute("select *form prodution");
	  String query="create table employee_table(eno int, ename varchar(20),esal int,eddr varchar(50)";
	  int rowCOunt= st.executeUpdate(query);
	  String rowCount;
	System.out.println("Table created successfully"+rowCount);
  } catch (SQLException e){
	  e.printStackTrace();
  }
  finally {

	Connection rs;
	rs.close();
	  Connection st;
	st.close();
	  Connection con;
	con.close();
	  
  }
  }
}

