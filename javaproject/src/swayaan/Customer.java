package swayaan;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Customer {
	private int id;
	 private String name;
	 private String dob;
	 private double salary;
	 private String email;
	 private int age;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String dob, double salary, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.email = email;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static void put(int i, Customer customer, Customer Customer) {
		
	// TODO Auto-generated method stub
	Map<Integer,Customer> shh=new HashMap<Integer,Customer>();	
	shh.put(1, new Customer(1,"vinay","07/03/1998",200000,"xyz@gmail.com",24));
	shh.put(2, new Customer(2,"dee","11/10/1998",240000,"xyz1@gmail.com",23));
	shh.put(3, new Customer(3,"arun","17/06/1998",250000,"xyz2@gmail.com",24));
	shh.put(4, new Customer(4,"sumanth","30/10/1998",220000,"xyz3@gmail.com",22));
	shh.put(5, new Customer(5,"neeraj","20/04/1998",210000,"xyz4@gmail.com",25));
	
	
 

	}
	@Override  
	public String toString() {  
	    return "Employee [emp_id = " + id + ", salary = " + salary + ", name = " + name + ", "
	            + ", age = " + age + ", email = " + email + "]";  
	    }
	public void String(Date parse) {
		// TODO Auto-generated method stub
		
	}  
		
	}
	 
	


