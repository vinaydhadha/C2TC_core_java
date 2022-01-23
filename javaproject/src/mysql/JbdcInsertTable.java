package mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JbdcInsertTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			  
			  try {
			  Class.forName("com.mysql.jdbc.Driver");
			  
			  }catch(ClassNotFoundException e) {
				  e.printStackTrace();
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
	}

}
