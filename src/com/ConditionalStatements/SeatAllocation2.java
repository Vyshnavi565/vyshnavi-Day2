package com.ConditionalStatements;
import java.util.Scanner;
public class SeatAllocation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns");
		int col=sc.nextInt();
		System.out.println("Enter the Roll number of the student");
		int n=sc.nextInt();
		if((n%row==1)||(n<=row)||(n>(row*(col-1)))&&(n<=(row*col)))
		{
			System.out.println("yes");
		}
		else 
		{
		    System.out.println("no");
		}

	}

}
