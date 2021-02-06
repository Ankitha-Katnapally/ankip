package org.ojas.app;

import java.util.Scanner;
	

public class SwitchMonth{
	static String daysOfMonth(String mName){
		String res =" ";
		switch(mName){
			case "JAN":                       
			case "MAR":
			case "MAY": 
			case "JUL": 
			case "AUG": 
			case "OCT": 
			case "DEC": 
				res= mName+"has only 31 days";
				break;
			case "APR": 
			case "JUN": 
			case "SEP": 
			case "NOV": 
				res= mName+" has 30 days";
				break;
			case "FEB":
				res= mName+"has 28 days";
			default:
				res="Invalid month name";
		}
		return res;
		    	

			
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a month");
		String mName=sc.next().toUpperCase();
		System.out.println(daysOfMonth(mName));
		
		
		
	}

}
