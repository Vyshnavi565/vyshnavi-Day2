package com.ConditionalStatements;
import java.util.Scanner;
public class HotelTariffCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int rent=sc.nextInt();
		int days=sc.nextInt();
		int amount=0;
		switch(month)
		{
		case 1: 
			amount=rent*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 2:
			amount=rent*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 3: 
			amount=rent*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 4:
			amount=(((20*rent)/100)+rent)*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 5:
			amount=(((20*rent)/100)+rent)*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 6:
			amount=(((20*rent)/100)+rent)*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 7:
			amount=rent*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 8:
			amount=rent*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 9:
			amount=rent*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 10:
			amount=rent*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 11: 
			amount=(((20/100)*rent)+rent)*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		case 12:
			amount=(((20/100)*rent)+rent)*days;
			System.out.printf("Hotel Tariff: Rs. "+amount);
			break;
		default :
			System.out.println("Invalid");
				
		}

	}

}
