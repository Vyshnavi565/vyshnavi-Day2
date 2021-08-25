package com.ConditionalStatements;
import java.util.Scanner;
public class FeeCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student type");
		String name=sc.nextLine();
		System.out.println("Enter tution fee");
		float tf=sc.nextFloat();
		System.out.println("Enter bus fee");
		float bf=sc.nextFloat();
		System.out.println("Enter hostel fee");
		float hf=sc.nextFloat();
		switch(name)
		{
		case "MSDS": float fee=tf+bf;
			System.out.println("Rs. "+fee);
			break;
		case "MSH": float fee1=tf+hf;
			System.out.println("Rs. "+fee1);
			break;
		case "MGSDS": float fee2=((150*tf)/100)+bf;
			System.out.println("Rs. "+fee2);
			break;
		case "MGSH": float fee3=((150*tf)/100)+hf;
			System.out.println("Rs. "+fee3);
			break;
		}

	}

}
