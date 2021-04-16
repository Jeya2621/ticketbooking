package com.chainsys;

import java.util.*;

public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile No. : ");
		Long mobileNumber = sc.nextLong();
		System.out.println("Enter the length of the Mobile Number:");
		int n = sc.nextInt();
		System.out.println("Enter the Password : ");
		String password = sc.next();
		System.out.println("Enter the length of the Password:");
		int n1 = sc.nextInt();
		
		if(mobileNumberCheck.checknumber(mobileNumber,n) == true && passwordCheck.checkpassword(password,n1) == true) {
			System.out.println("Successfully Logged In");
		}
		else
		{
			System.out.println("Incorrect Mobile Number OR Password");
			System.exit(0);
		}
		
		seattype.SeatType();
		
		fareCalculation.calculation();
		
	}

}
