package com.ConditionalStatements;
import java.util.Scanner;
public class LabAllocation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int L1=sc.nextInt();
		System.out.println("Enter y");
		int L2=sc.nextInt();
		System.out.println("Enter z");
		int L3=sc.nextInt();
		if(L1<L2 && L1<L3)
		{
			System.out.println("L1 has the minimal seating capacity");
		}
		else if(L2<L1 && L2<L3)
		{
			System.out.println("L2 has the minimal seating capacity");
		}
		else if(L3<L1 && L1<L2)
		{
			System.out.println("L3 has the minimal seating capacity");
		}

	}

}
