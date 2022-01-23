package demo;

import java.util.Scanner;

public class posorneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("the number is positive");
		}
		else if(num<0) {
			System.out.println("the negative");
		}
		else
			System.out.println("the number zero");
	}

}
