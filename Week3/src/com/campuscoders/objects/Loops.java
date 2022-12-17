package com.campuscoders.objects;

public class Loops {
	public static void main (String[] args) {
		
		// initialization, termination condition, increment
		for (int i = 1; i <= 100; i = i +33) {
			System.out.print(i + ": ");
			System.out.println(i*i);
		}
		
		System.out.println("done!!");
	}
}
