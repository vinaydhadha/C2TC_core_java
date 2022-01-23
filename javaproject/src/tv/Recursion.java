package tv;

public class Recursion {

	public static void main(String[] args) {
		int a,res=1234,n;
		Recursion sc=new Recursion();
		System.out.println("Enter a number");
		n=sc();
		while(n!=0)
		{
		a=n%10;
		res=(res*10)+a;
		n=n/10;
		}
		System.out.println("reverse of a number is "+res);
		}

	private static int sc() {
		// TODO Auto-generated method stub
		return 0;
	}
}
