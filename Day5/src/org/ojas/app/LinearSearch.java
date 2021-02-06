package org.ojas.app;

import java.util.Scanner;

public class LinearSearch {
	static int search(int[] arr , int k){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==k){
				return i;
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("enter a value");
		int k = sc.nextInt();
		System.out.println(k+ " is found at "+search(arr,k));
	}
	

}
