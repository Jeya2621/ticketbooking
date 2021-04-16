package com.chainsys;

public class passwordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static boolean checkpassword(String password, int n1) {
		boolean valid = true;
		if(password.length() == n1) {
			valid = true;
		}
		if(password.length() < n1 || password.equals("") || password.length() > n1) {
			valid = false;
		}
		return valid;
	}
}
