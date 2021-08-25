package com.ConditionalStatements;
import java.util.Scanner;
import java.lang.*;
public class LabAllocation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x");
		int L1=sc.nextInt();
		System.out.println("Enter y");
		int L2=sc.nextInt();
		System.out.println("Enter z");
		int L3=sc.nextInt();
		System.out.println("Enter the lab allocated for ACE Training");
		String acelab=sc.next();
		if(acelab.equals("L1")) {
		if(L2<L3)
		{
			System.out.println("L2 has the minimal seating capacity");
		}
		else
		{
			System.out.println("L3 has the minimal seating capacity");
		}
		}
	    else if(acelab.equals("L2")){
		if(L1<L3)
		{
			System.out.println("L1 has the minimal seating capacity");
		}
		else
		{
			System.out.println("L3 has the minimal seating capacity");
		}
		}
		else if(acelab.equals("L3")){
		if(L1<L2)
		{
			System.out.println("L1 has the minimal seating capacity");
		}
		else
		{
			System.out.println("L2 has the minimal seating capacity");
		}
		}

	}

}

