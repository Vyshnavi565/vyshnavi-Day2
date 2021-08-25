package com.ConditionalStatements;
import java.util.Scanner;
public class LabAllocation3 {

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

	    if((n<=L1)&&(n<=L2)&&(n<=L3))
		{
			System.out.println("3 lab(s) can accommodate " +n+" students"  );
		}
		else if((n<=L1&&n<=L2)||(n<=L2&&n<=L3)||(n<=L3&&n<=L1))
		{
			System.out.println("2 lab can accommodate" +n+" students");
		}
		
		else if(n<=L1||n<=L2||n<=L3)
		{
			System.out.println("1 lab can accommodate " +n+" stdents"  );
		}
		else 
		{
			System.out.println("None of the lab(s) can accommodate " +n+" stdents"  );
		}
		

	}

}
