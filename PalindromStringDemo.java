package com.omniwyse.Assignment1;

import java.util.Scanner;

/**
 * 
 * @author imran
 * this applicatio will check if the given string is palindrom or not means
 * from the both end the value of the string will be the same. 
 *
 */
public class PalindromStringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to be checked for palindorm");
		String newStr=sc.nextLine();
		System.out.println(isPalindrom(newStr));
			
		sc.close();
		
	}
	public static boolean isPalindrom(String str) {
		int l=str.length();
		for(int i=0;i<(l/2);i++) {
			if(str.charAt(i)!=str.charAt(l-i-1)) {
				return false;
			}
			
		}
		return true;
	}
}
