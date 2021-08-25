package com.ConditionalStatements;
import java.util.Scanner;
public class Y2KProblemDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year of birth");
		int yearb=sc.nextInt();
		System.out.println("Enter current year");
		int yearc=sc.nextInt();
		if(yearb>yearc)
		{
		int age=yearb-yearc;
			System.out.println("your age is: "+age);
		}
		else
		{
			System.out.println(yearc-yearb);
		}
	}

}
