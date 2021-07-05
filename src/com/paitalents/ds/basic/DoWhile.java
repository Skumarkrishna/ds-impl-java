package com.paitalents.ds.basic;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Double a, summation = 0.0;
        Scanner kb = new Scanner(System.in);
        do {
                   System.out.print("Enter a number to perform addition and zero to exit: ");
                   a = kb.nextDouble();
                   summation += a;
       } 
       while (a != 0.0);
       System.out.println("Sum of the numbers = " + summation);
	}
}
