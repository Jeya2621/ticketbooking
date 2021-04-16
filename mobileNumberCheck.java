package com.chainsys;


public class mobileNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		public static boolean checknumber(Long mobileNumber, int n) {
			boolean valid = true;
			String mb_String = Long.toString(mobileNumber);
			if(mb_String.length() == n) {
				valid = true;
			}
			if(mb_String.length()!= n || mb_String.equals("") || mb_String.length()<0) {
				valid = false;
			}
			return valid;
		}
	}

