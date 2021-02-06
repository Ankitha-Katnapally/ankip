package org.ojas.app;

import java.util.Arrays;

public class AsciiCharArray {
	public static void main(String[] args) {
		char name[]={'P','H','A','N','I'};
		Arrays.sort(name);
		int names[] = new int[name.length];
		for(int i=0;i<name.length;i++){
			names[i]=name[i];
		
		}
		for(int x: names){
			System.out.println(x);
		}
	}

}
