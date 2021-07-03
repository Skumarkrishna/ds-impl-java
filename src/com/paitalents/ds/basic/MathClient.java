package com.paitalents.ds.basic;

public class MathClient {

	public static void main(String[] args) {
		System.out.println("Welcome to basic DS problem");
		useMathFunction();
	}
	
	private static void useMathFunction() {
		//1. Use Sin function
		//2. Cos 
		//3. Use min, median, mode, max, mean
		System.out.println("Math.PI =  " + Math.PI);
		int x = 12, y = 32;
		System.out.println("Max of " + x + " , " + y + " is " + Math.max(x, y));
	}
}