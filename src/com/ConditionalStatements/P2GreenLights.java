package com.ConditionalStatements;
import java.util.Scanner;
public class P2GreenLights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float s=sc.nextFloat();
		float d=sc.nextFloat();
		float t=sc.nextFloat();
		float x=s/(60*60);
		float time=d/x;
		if(t>time)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
		
	}

}
