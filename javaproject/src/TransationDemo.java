import com.mysql.jdbc.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class TransationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	 Class.forName("com.mysql.cj.jdbc.Driver");
     }catch (ClassNotFoundException e) {
    	 e.printStackTrace();
    	 
     }
     try {
    	 Connection con = DriverManager.getConnection("jdbc:mysql://loaclhost:3306/db_employee","root","rootpassword");
    	 Statement st= con.createStatement();
    	 System.out.println("Account Infromation Before Transtion ");
    	 ResultSet rs=st.executeQuery("select * from acc_transtion");
    	 while(rs.next()) {
    		 System.out.println(rs.getString(1)+"" + rs.getInt(4));
    	 }
    	 con.setAutoCommit(false);
    	 st.executeUpdate("Update acc_transtion set balance = balance+5000 where name='Arun'");
    	 st.executeUpdate("Update acc_transtion set balance = balance+5000 where name='Vinay'");
    	 st.executeUpdate("Update acc_transtion set balance = balance-5000 where name='Dee'");
    	 st.executeUpdate("Update acc_transtion set balance = balance+5000 where name='Sumanth'");
    	 System.out.println("Can you confirm transaction?[yes/no]");
    	 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	 String option= sc.next();
    	 if(option.equalsIgnoreCase("yes")){
    		con.commit();
    		System.out.println("Transaction committed");
    	 }
    	 else {
    		 con.rollback();
    		 System.out.println("Tranaction rollback");
    	 }
    	 System.out.println("Accout Infromation after the transaction");
    	 @SuppressWarnings("unused")
		ResultSet rs1 =st.executeQuery("select * from acc_treansaction");
    	 while (rs.next()) {
    		 System.out.println(rs.getString(1)+" "+rs.getInt(4));
    	 }
    	 st.close();
    	 con.close();
    	
    	 } catch (Exception e) {
    		 e.printStackTrace();
    	
     }
	}

}
