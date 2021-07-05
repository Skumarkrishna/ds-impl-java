package com.paitalents.ds.basic;

import java.util.Scanner;

public class TernaryOperators {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
        System.out.println("Enter any integer value to a");
        int a = kb.nextInt();
        System.out.println("Enter any integer value to b");
        int b = kb.nextInt();
        int greater = (a < b) ? a : b;
        System.out.println(greater);
	}
}
