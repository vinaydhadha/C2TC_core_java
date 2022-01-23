package demo;

import java.util.Scanner;

public class swap2no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value x and y");
		x=sc.nextInt();
		y=sc.nextInt();
		System.out.println("before swapping no:"+x+""+y);
		t=x;
		x=y;
		y=t;
		System.out.println("after swapping:"+x+" "+y);
		System.out.println();

	}

}
