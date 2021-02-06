package org.ojas.app;

import java.util.Scanner;

public class ArrayMarks {
	static void dispMarks(int [] marks){
		System.out.println("marks are as follows");
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
	}
	static int[] reverseMarks(int [] marks){
		int rev[] = new int[marks.length];
		int k=0;
		for(int i=marks.length;i>=0;i--){
			rev[k]=marks[i];
			k++;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 sub marks");
		int marks[] = new int[5];
		for(int i=0;i<marks.length;i++){
			marks[i]=sc.nextInt();
		}
		dispMarks(marks);
		
		
	}

}
