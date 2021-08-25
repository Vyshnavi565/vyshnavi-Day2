package com.ConditionalStatements;
import java.util.Scanner;
public class ComparingTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		if(i>j) 
		{
			System.out.println(i+" is greater than "+j);
		}
		else
		{
			System.out.println(i+" is less than "+j);
		}

	}

}
