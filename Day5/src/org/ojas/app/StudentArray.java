package org.ojas.app;

import java.util.Scanner;

public class StudentArray {
	static String avrg(int[] arr){
		int sum=0;
		int avg=0;
		String res=" ";
		for(int i=0;i<arr.length;i++){
			if(arr[i]>35){
				res="you are passed";
				for(i=0;i<arr.length;i++){
			        sum+=arr[i];
				}
         		avg=sum/arr.length;
		
		        if(avg>=75){
			            res="distinction";
		        }
				else if(avg >= 65) {
						res = "first class\n";
					}
				else if(avg >= 55) {
						res = "second class\n";
					}
				else {
						res = "third class\n";
					}
			}
			else{
				res+=" fail";
			}
		}
		return res;
		
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number of subjects");
		int n = sc.nextInt();
		System.out.println("enter subject marks");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(avrg(arr));
		
		
		
		
	}

}
