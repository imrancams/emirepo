package com.omniwyse.Assignment1;

import java.util.Scanner;

/**
 * 
 * @author imran ahmad
 * 
 * this application will find out the palindrom numbers
 *
 */
public class PalindromNumberDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check");
		int num=sc.nextInt();
		int revNum = getReverse(num);
		sc.close();
		if(num==revNum) {
			System.out.println("the given number is palindrom number ");
		}
		else {
			System.out.println("the given number is not a palindrom number");
		}
	}

	private static int getReverse(int num) {
		int rev=0;
		int remainder=0;
		while(num>0) {
			remainder=num%10;
			rev=rev*10+remainder;
			num=num/10;
		}
		return rev;
		
	}

	
}
