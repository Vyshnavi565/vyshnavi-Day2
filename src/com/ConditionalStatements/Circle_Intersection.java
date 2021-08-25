package com.ConditionalStatements;
import java.util.Scanner;
import java.lang.Math.*;
public class Circle_Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		int r1=sc.nextInt();
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		int r2=sc.nextInt();
		double power=Math.pow((x2-x1),2)+Math.pow((y2-y1),2);
		double dis=Math.sqrt(power);
		if((r1+r2)==dis)
		{
			System.out.println("The circle is tangential");
		}
		else if((r1+r2)>dis)
		{
			System.out.println("The circles overlap");
		}
		else 
		{
			System.out.println("The circles do not overlap");
		}
		
	}

}
