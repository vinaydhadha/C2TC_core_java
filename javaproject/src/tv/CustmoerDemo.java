package tv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustmoerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Customer> listcustmoer=new ArrayList<Customer>();
listcustmoer.add(new Customer(1,"vinay","07/03/1998",200000,"xyz@gmail.com",24));
listcustmoer.add(new Customer(2,"dee","11/10/1998",240000,"xyz1@gmail.com",23));
listcustmoer.add(new Customer(3,"arun","17/06/1998",250000,"xyz2@gmail.com",24));
listcustmoer.add(new Customer(4,"sumanth","30/10/1998",200000,"xyz3@gmail.com",22));
listcustmoer.add(new Customer(5,"neeraj","20/04/1998",200000,"xyz4@gmail.com",25));
for(Customer e:listcustmoer) {
	System.out.println("Customer id"+e.getId());
	System.out.println("Customer name"+e.getName());
	System.out.println("Customer dob"+e.getDob());
	System.out.println("Customer salary"+e.getSalary());
	System.out.println("Customer email id"+e.getEmail());
	System.out.println("Customer age"+e.getAge());
	
}
Collections.sort(listcustmoer, new SortList());
System.out.println(listcustmoer);
for(Customer e:listcustmoer) {
	System.out.println("Customer id"+e.getId());
	System.out.println("Customer name"+e.getName());
	System.out.println("Customer dob"+e.getDob());
	System.out.println("Customer salary"+e.getSalary());
	System.out.println("Customer email id"+e.getEmail());
	System.out.println("Customer age"+e.getAge());
	
}
class SortList implements Comparator <Customer>{
	public int compare (Customer o1 ,Customer o2) {
	return (int)(o1.getSalary()-o2.getSalary());
	
	}
}
	}

}
