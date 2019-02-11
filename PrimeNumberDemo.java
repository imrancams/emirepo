package com.omniwyse.Assignment1;

import java.util.Scanner;
/*
 * 
 * @Author imran
 * prime number is a number which is only divisible by itself
 * 
 */
public class PrimeNumberDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		sc.close();
		
		
	}//main
	public static boolean isPrime(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("the given number "+ num +" is a prime number");
			return true;
		}
		else {
			System.out.println("the given number "+ num +" is not a prime number");
			return false;
		}
		
	}

}//class
