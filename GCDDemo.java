package com.omniwyse.Assignment1;

import java.util.Scanner;
/**
 * 
 * 
 * @author imran
 * this program is used to find the greatest 
 * divisor between two given numbers.W
 *
 */

public class GCDDemo {

	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int d=gcd(a ,b);
		System.out.println(d);

	}

	private static int gcd(int num1, int num2) {
		if(num2!=0) {
			return gcd(num2,num1%num2);
		}
		else {
			return num1;
		}
	}	
		

}
