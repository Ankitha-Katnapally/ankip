package org.ojas.app;

import java.util.Scanner;

public class BiggestValueArray {
	static int biggNum(int[] val){
		int max = val[0];
		for(int i=0;i<val.length;i++){
			if(val[i]>max){
				max=val[i];
				
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter array values");
		int val[] = new int[5];
		for(int i=0;i<val.length;i++){
			val[i]=sc.nextInt();
		}
		System.out.println(biggNum(val));
		}

}
