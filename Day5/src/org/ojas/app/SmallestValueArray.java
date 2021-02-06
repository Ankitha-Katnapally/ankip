package org.ojas.app;

import java.util.Scanner;

public class SmallestValueArray {
	static  int smallNum(int[] val){
		int min = val[0];
		for(int i=0;i<val.length;i++){
			if(min>val[i]){
				min=val[i];
				
			}
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array values");
		int val[] = new int[5];
		for(int i=0;i<val.length;i++){
			val[i]=sc.nextInt();
		}
		System.out.println(smallNum(val));
		}


}
