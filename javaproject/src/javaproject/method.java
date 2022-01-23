package javaproject;

public class method {

	
	public  void area(double r) {
	double area=3.142*r*r;
	System.out.println("area"+area);
	
	}
public  void area1(float b ,float h) {
	double tri=0.5*b*h;
	System.out.println("triangel:"+tri);
}
	
	public static void main(String args[]) {
	method	n=new method();
		n.area(4);
		
}
}



