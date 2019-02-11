package com.omniwyse.Assignment1;

import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author imran
 * 
 * this application will generate fibbonacci series 
 *
 */
public class FibbonacciDemo {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of fibbonacci you want to generate");
		int n=sc.nextInt();
		sc.close();
		int i=1;
		int t1=0;
		int t2=1;
		
		System.out.println("first "+ n +" fibbonacci terms are..");
		while(i<=n) {
			System.out.println(t1 +" ");
			int sum=t1+t2;
			t1=t2;
			t2=sum;
			i++;
		}
	}
}
