package org.ojas.app;

import java.util.Scanner;

public class BinarySearch {
	static int binary(int[] arr , int k, int first,int last){
		int mid =(first+last)/2;
		   while( first <= last ){  
			      if ( arr[mid] < k ){  
			        first = mid + 1;     
			      }else if ( arr[mid] == k ){  
			        System.out.println("Element is found at index: " + mid);  
			        break;  
			      }else{  
			         last = mid - 1;  
			      }  
			      mid = (first + last)/2;  
			   }  
			   if ( first > last ){  
			      System.out.println("Element is not found!");  
			   }  
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array values");
		int arr[] = new int[6];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("enter any key");
		int k = sc.nextInt();
		int last=arr.length-1;
		int first=0;
		binary(arr, k, first, last);
	}

}
