package org.ojas.app;

import java.util.Scanner;
import java.util.Stack;

public class StackArray {
	 static int arr[];
	 static int top;
	 static int capacity;
	
	 static void Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;

	}
	 static int size(){
		 return top+1;
	 }
	 static boolean isfull(){
		 return top==capacity-1;
		 
	 }
	    static Boolean isEmpty()
	    {
	        return top == -1;    
	    }
	    static int peek(){
	    	if(!isEmpty()){
	    		return arr[top];
	    	}
	    	else{
	    		System.exit(1);

	    	}
	    	return -1;
	    }

	 static void push(int[] arr){
		 if(isfull()){
			 System.out.println("Stack is full");
			 System.exit(1);
		 }
		 else{
			 for(int i=0;i<arr.length;i++){
			 System.out.println("inserting " +arr[i]);
			 int[] arr1 = new int[arr.length];
			 arr1[++top]=arr[i];
			 }
		 }
	 }
	    static int pop()
	    {
	        if (isEmpty())
	        {
	            System.out.println("No elements to pop");
	            System.exit(1);
	        }
	 
	        System.out.println("Removing " + peek());
	        return arr[top--];
	    }

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of stack");
		int n = sc.nextInt();
		Stack(n);
		System.out.println("Enter the numbers to be pushed");
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		push(arr);
        System.out.println("Top element is: " + StackArray.peek());
        System.out.println("Size of Stack is: " + StackArray.size());
        pop();
        if (StackArray.isEmpty())
            System.out.println("Stack Is Empty");
        else
            System.out.println("Stack Is Not Empty");
    }


	}

