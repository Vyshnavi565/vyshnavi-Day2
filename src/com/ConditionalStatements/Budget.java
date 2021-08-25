package com.ConditionalStatements;
import java.util.Scanner;
public class Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		float blast_rifle=350.34;
//		float visual_sensors=230.90;
//		float audit_sensors=190.55;
//		float arms=125.30;
//		float legs=180.90;
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		double amount=((350.34*a)+(230.90*b)+(190.55*c)+(125.30*d)+(180.90*e));
		if(amount<=15000)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}
