package org.ojas.app;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	static int[] sort(int[] arr){
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		System.out.println("elements in sorted order");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values");
		int arr[] = new int[3];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		sort(arr);
		
		
	}

}
