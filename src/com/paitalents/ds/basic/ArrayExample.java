package com.paitalents.ds.basic;

import java.util.Scanner;

public class ArrayExample {
	
	public static void main( String args[]) {
		int rows = 3, cols = 2; 
		double invoice[][]= new double[rows][cols];  // Initializing array
		Scanner kb = new Scanner(System.in);    // creating a scanner object to take input from user
		for(int i=0; i<rows; i++){                       // nested for loops
        for(int j=0; j<cols; j++){
          System.out.println("Enter the value");
          invoice[i][j] = kb.nextDouble();         // store values to array 
        }
		}
    for(int i=0; i<rows; i++){
        for(int j=0; j<cols; j++) {
          System.out.print(invoice[i][j] + "  ");
        }
        System.out.println();
   }
	}
}
