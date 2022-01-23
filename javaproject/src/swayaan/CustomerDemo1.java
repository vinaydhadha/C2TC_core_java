package swayaan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class CustomerDemo1 {
	
	    public static void main(String[] args) {
	    	try{
	    		SimpleSalaryFormat sdf=new SimpleSalaryFormat();
	    		Customer e1=new Customer();
	    		e1.setId(1);
	    		e1.String(sdf.parse("200000"));

	    		Customer e2=new Customer();
	    		e2.setId(2);
	    		e2.String(sdf.parse("240000"));

	    		Customer e3=new Customer();
	    		e3.setId(3);
	    		e3.String(sdf.parse("250000"));
	    		
	    		Customer e4=new Customer();
	    		e4.setId(4);
	    		e4.String(sdf.parse("220000"));

	    		Customer e5=new Customer();
	    		e5.setId(5);
	    		e5.String(sdf.parse("210000"));
	    		
	    		
	    		List<Customer> list=new ArrayList<Customer>();
	    		list.add(e1);
	    		list.add(e2);
	    		list.add(e3);
	    		list.add(e4);
	    		list.add(e5);

	    		Collections.sort(list,new DateComparator());
	    		System.out.println("Sorted List");

	    		for(Customer e:list){
	    		System.out.println("ID "+e.getId()+" & salary : "+e.getSalary());
	    		}
	    		}catch (Exception e) {
	    		System.out.println(e.getMessage());
	    		// TODO: handle exception
	    		}
	    		}
}
