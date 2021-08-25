package com.ConditionalStatements;
import java.util.Scanner;
public class MicrowaveOven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of items");
		int h=sc.nextInt();
		System.out.println("Enter the number of items");
		float t=sc.nextFloat();
		if(h==1)
		{
			System.out.println("The recommended heating time is: "+h);
		}
		else if(h==2)
		{
			double time=t+(0.5*t);
			System.out.println("The recommended heating time is: "+time);
		}
		else if(h==3)
		{
			double time=t+(2*t);
			System.out.println("The recommended heating time is: "+time);
		}
		else
		{
			System.out.println("Number of items is more");
		}

	}

}
