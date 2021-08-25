package com.ConditionalStatements;
import java.util.Scanner;
public class AnnaUnivGradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		if(i==100)
			System.out.println("S");
		
		else if(i>=90 && i<100) 
			System.out.println("A");
		
		else if(i>=80 && i<90)
			System.out.println("B");
		
		else if(i>=70 && i<80)
			System.out.println("C");
		
		else if(i>=60 && i<70)
			System.out.println("D");
		
		else if(i>=50 && i<60)
			System.out.println("E");
		
		else if(i<50)
			System.out.println("F");
		
		else
			System.out.println("Invalid");
		}
			

	}

