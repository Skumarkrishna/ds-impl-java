package com.paitalents.ds.basic;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = kb.nextInt();
        int i = 2;
        boolean flag = false;
        while(i <= num/2) {
             if(num % i == 0) {
                   flag = true;
                   break;
             }
            ++i;
       }
       if (!flag)
            System.out.println(num + " is a prime number.");
       else
            System.out.println(num + " is not a prime number.");
	}
}
