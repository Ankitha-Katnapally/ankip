package org.ojas.app;

import java.util.Scanner;

public class Switchvowels {
	static boolean isVowel(char ch){
		boolean b= false;
		if(Character.isLetter(ch)){
			switch(ch){
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				b=true;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().toUpperCase().charAt(0);
		String res = " ";
		if(isVowel(ch)){
			res=ch+" is vowel";
		}
		else{
			res = ch+" is other character";
		}
		System.out.println(res);
		
		
	}

}
