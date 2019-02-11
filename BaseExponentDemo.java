package com.omniwyse.Assignment1;

import java.util.Scanner;

/**
 * 
 * @author imran
 * 
 *         this applicatio will find out the the value x to the power of y.
 *
 */
public class BaseExponentDemo {

	
	//calculating power using recursion
	/*
	  public static int power(int x, int y) { if (y == 0) // bcoz the 0 power of
	  any number is 1. return 1;
	  
	  else if (y % 2 == 0) return power(x, y / 2) * power(x, y / 2);
	  
	  else return x * power(x, y / 2) * power(x, y / 2); }// method
	 */
	
	
	//calculating power using standard method
	public static int powerMethod(int p,int q) {
		int result=1;
		if(p>=0&&q==0) {
			result= 1;
		}
		else if(p==0&&q>=1) {
			result= 0;
		}
		else {
			for(int i=1;i<=q;i++) {
				result *=p;
			}
		}
		System.out.println(p+"^"+q+"="+result);
		return result;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and exponent");
		int a = sc.nextInt();
		int b = sc.nextInt();
		//int pow = power(a, b);
		//System.out.println(pow);
		sc.close();
		powerMethod(a, b);
	}
}
