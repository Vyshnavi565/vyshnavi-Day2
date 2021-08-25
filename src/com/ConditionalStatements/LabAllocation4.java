package com.ConditionalStatements;
import java.util.Scanner;
public class LabAllocation4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int L1=sc.nextInt();
		System.out.println("Enter y");
		int L2=sc.nextInt();
		System.out.println("Enter z");
		int L3=sc.nextInt();
		System.out.println("Enter n");
		int n=sc.nextInt();
		if(n<=L1)
		{
			System.out.println("L1 should be allocated to this class");
		}
		else if(n<=L2)
		{
			System.out.println("L2 should be allocated to this class");
		}
		else if(n<=L3)
		{
			System.out.println("L3 should be allocated to this class");
		}
		else if(n<=L1&&n<=L2)
		{
			System.out.println("L1 should be allocated to this class");
		}
		else if(n<=L2&&n<=L3)
		{
			System.out.println("L2 should be allocated to this class");
		}
		else if(n<=L3&&n<=L1)
		{
			System.out.println("L3 should be allocated to this class");
		}
		else
		{
			System.out.println("None of the labs can be allocated");
		}

	}

}
