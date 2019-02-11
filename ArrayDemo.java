package com.omniwyse.Assignment1;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the array elements");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		sc.close();
		//display the array elements
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		
		//search the elements of array	
		int searchElement=40;
		for (int i = 0; i < array.length; i++) {
			if(array[i]==searchElement) {
				System.out.println("search Element is available");
			}
			
		}
		
		
	}
}
