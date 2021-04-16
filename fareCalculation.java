package com.chainsys;

import java.util.Scanner;

public class fareCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select the Class Type You Need");	
	}
	
	public static void calculation() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.equalsIgnoreCase("PLATINUM")) {
			System.out.println("Enter No. of Seats you Need");
			int n = sc.nextInt();
			int total = n * 250;
			System.out.println("Price for "+n+" Seats is :"+total);
			System.out.println(".....GST 7%.....");
			float gst = total + (total* 7/100);
			System.out.println("Total Price Amount : "+gst);
		}
		
		else if(s.equalsIgnoreCase("GOLD")) {
			System.out.println("Enter No. of Seats you Need");
			int n = sc.nextInt();
			int total = n * 200;
			System.out.println("Price for "+n+" Seats is :"+total);
			System.out.println(".....GST 7%.....");
			float gst = total + (total* 7/100);
			System.out.println("Total Price Amount : "+gst);
		}
		
		else if(s.equalsIgnoreCase("SILVER")) {
			System.out.println("Enter No. of Seats you Need");
			int n = sc.nextInt();
			int total = n * 50;
			System.out.println("Price for "+n+" Seats is :"+total);
			System.out.println(".....GST 7%.....");
			float gst = total + (total* 7/100);
			System.out.println("Total Price Amount : "+gst);
		}
		
		else {
			System.out.println("Enter the Correct Class");
			System.exit(0);
		}
		
		
	}

}
