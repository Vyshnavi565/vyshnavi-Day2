package com.ConditionalStatements;
import java.util.Scanner;
public class AFruitSeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the prize of dozen mangoes");
		float cp=sc.nextFloat();
		System.out.println("Enter the prize at which 1 mango is being sold");
		float y=sc.nextFloat();
		float sp=y*12;
		if(sp-cp>0)
		{
			System.out.println("Profit: Rs."+(sp-cp));
		}
		else
		{
			System.out.println("Loss: Rs."+(cp-sp));
		}

	}

}
