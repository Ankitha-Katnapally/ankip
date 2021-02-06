package org.ojas.app;

import java.util.Scanner;

public class QueueArray {
	static int front,rear,capacity;
	static int queue[];
    static void Queue(int n) 
    { 
        front = rear = 0; 
        capacity = n; 
        queue = new int[capacity]; 
    } 
    static void display(){
    	if(front==rear){
    		System.out.println("Queue is empty");
    	}
    	else{
    		for(int i=front;i<rear;i++){
    			System.out.println(queue[i]);
    		}
    	}
    }

	
	static void Addition(int[] arr){
		if(capacity==rear){
			System.out.println("Stack is full");
		}
		else{
			for(int i=0;i<arr.length;i++){
		    System.out.println(" adding " +arr[i]);

			queue[rear]=arr[i];
			rear++;	
		}		
	}
	}
	static void remove(){
		
		if(front==rear){
    		System.out.println("Queue is empty");
    	}
		else{
			for(int i=0;i<rear-1;i++){
				queue[i]=queue[i+1];
				}
		}

		    if(rear<capacity){
				queue[rear]=0;
			}
			rear--;
		}
	static void front(){
		if(front==rear){
			System.out.println("queue is empty");
		}
		else{
			System.out.println("front element is"+queue[front]);
		}
	}
		
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of queue");
		int n = sc.nextInt();
		Queue(n);
		display();
		int arr[] = new int[n];
		System.out.println("Enter the queue elements ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		Addition(arr);
		System.out.println("now elements present in queue are");
		display();
		remove();
		System.out.println("after one deletion");
		display();
		front();
		

		
	}

}
